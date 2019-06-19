package javafx.controller;

import javafx.beans.property.ObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.interfaces.impls.CollectionAddressBook;
import javafx.objects.Lang;
import javafx.objects.Person;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.utils.DialogManager;
import javafx.utils.LocaleManager;
import org.controlsfx.control.textfield.CustomTextField;
import org.controlsfx.control.textfield.TextFields;


import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Locale;
import java.util.Observable;
import java.util.ResourceBundle;

public class MainController extends Observable implements Initializable {

    private static final String RU_CODE = "ru";
    private static final String EN_CODE = "en";
    private CollectionAddressBook addressBookImpl = new CollectionAddressBook();

    @FXML
    private Button btnAdd;
    @FXML
    private Button btnEdit;
    @FXML
    private Button btnDelete;
    @FXML
    private CustomTextField txtSearch;
    @FXML
    private Button btnSearch;
    @FXML
    private TableView tableAddressBook;
    @FXML
    private Label labelCount;
    @FXML
    private TableColumn<Person, String> columnFIO;
    @FXML
    private TableColumn<Person, String> columnPhone;
    @FXML
    private ComboBox comboLocale;

    private Parent fxmlEdit;
    private FXMLLoader fxmlLoader = new FXMLLoader();
    private EditDialogController editDialogController;
    private Stage editDialogStage;
    private Stage mainStage;
    private ResourceBundle resourceBundle;
    private ObservableList<Person> backupList;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.resourceBundle = resources;
        tableAddressBook.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        columnFIO.setCellValueFactory(new PropertyValueFactory<Person, String>("fio"));
        columnPhone.setCellValueFactory(new PropertyValueFactory<Person, String>("phone"));
        setUpClearButtonField(txtSearch);
        initListeners();
        fillData();
        initLoader();
    }

    private void setUpClearButtonField(CustomTextField txtSearch) {
        try {
            Method m = TextFields.class.getDeclaredMethod("setupClearButtonField", TextField.class, ObjectProperty.class);
            m.setAccessible(true);
            m.invoke(null, txtSearch, txtSearch.rightProperty());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void fillData() {
        fillTable();
        fillLangComboBox();
    }

    private void fillLangComboBox() {
        Lang langRU = new Lang(0, RU_CODE, resourceBundle.getString("ru"), LocaleManager.RU_LOCALE);
        Lang langEN = new Lang(1, EN_CODE, resourceBundle.getString("en"), LocaleManager.EN_LOCALE);

        comboLocale.getItems().add(langRU);
        comboLocale.getItems().add(langEN);

        if (LocaleManager.getCurrentLang() == null) {
            comboLocale.getSelectionModel().select(0);
        } else  {
            comboLocale.getSelectionModel().select(LocaleManager.getCurrentLang().getIndex());
        }

    }

    private void fillTable() {
        addressBookImpl.fillTestData();
        backupList = FXCollections.observableArrayList();
        backupList.addAll(addressBookImpl.getPersonList());
        tableAddressBook.setItems(addressBookImpl.getPersonList());
    }

    private void initLoader() {
        try {
            fxmlLoader.setLocation(getClass().getResource("../fxml/edit.fxml"));
            fxmlLoader.setResources(ResourceBundle.getBundle("javafx.bundles.locale", new Locale("en")));
            fxmlEdit = fxmlLoader.load();
            editDialogController = fxmlLoader.getController();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void initListeners() {
        addressBookImpl.getPersonList().addListener(new ListChangeListener<Person>() {
            @Override
            public void onChanged(Change<? extends Person> c) {
                updateCountLabel();
            }
        });

        tableAddressBook.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (event.getClickCount() == 2) {
                    editDialogController.setPerson((Person)tableAddressBook.getSelectionModel().getSelectedItem());
                    showDialog();
                }
            }
        });

        comboLocale.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Lang selectedLang = (Lang) comboLocale.getSelectionModel().getSelectedItem();
                LocaleManager.setCurrentLang(selectedLang);

                setChanged();
                notifyObservers(selectedLang);
            }
        });
    }

    private void updateCountLabel() {
        labelCount.setText(resourceBundle.getString("count") + ": " + addressBookImpl.getPersonList().size());
    }

    public void actionButtonPressed(ActionEvent actionEvent) {
        Object source = actionEvent.getSource();
        if (!(source instanceof Button)) {
            return;
        }

        Button clickedButton = (Button) source;
        Person selectedPerson = (Person)tableAddressBook.getSelectionModel().getSelectedItem();
        Window parentWindow = ((Node)actionEvent.getSource()).getScene().getWindow();
        editDialogController.setPerson(selectedPerson);

        switch (clickedButton.getId()){
            case "btnAdd":
                editDialogController.setPerson(new Person());
                showDialog();
                addressBookImpl.add(editDialogController.getPerson());
                backupList.clear();
                backupList.addAll(addressBookImpl.getPersonList());
                break;
            case "btnEdit":
                if (!personIsSelected(selectedPerson)) {
                    return;
                }
                editDialogController.setPerson((Person)tableAddressBook.getSelectionModel().getSelectedItem());
                showDialog();
                break;
            case "btnDelete":
                if (!personIsSelected(selectedPerson)) {
                    return;
                }
                addressBookImpl.delete((Person)tableAddressBook.getSelectionModel().getSelectedItem());
                backupList.clear();
                backupList.addAll(addressBookImpl.getPersonList());
                break;
            case "btnSearch":
                actionSearch(actionEvent);
                break;
        }
    }

    private boolean personIsSelected(Person selectedPerson) {
        if (selectedPerson == null) {
            DialogManager.showInfoDialog(resourceBundle.getString("error"), resourceBundle.getString("selected_person"));
            return false;
        }
        return true;
    }

    private void showDialog() {
       if (editDialogStage == null) {
           editDialogStage = new Stage();
           editDialogStage.setTitle(resourceBundle.getString("edit_text"));
           editDialogStage.setMinHeight(150);
           editDialogStage.setMinWidth(300);
           editDialogStage.setResizable(false);
           editDialogStage.setScene(new Scene(fxmlEdit));
           editDialogStage.initModality(Modality.WINDOW_MODAL);
           editDialogStage.initOwner(mainStage);
       }
       editDialogStage.showAndWait();
    }


    public void setMainStage(Stage mainStage) {
        this.mainStage = mainStage;
    }

    public void actionSearch(ActionEvent actionEvent) {
        addressBookImpl.getPersonList().clear();
        for (Person person : backupList) {
            if (person.getFio().toLowerCase().contains(txtSearch.getText().toLowerCase()) ||
                person.getPhone().toLowerCase().contains(txtSearch.getText().toLowerCase())) {
                addressBookImpl.getPersonList().add(person);
            }
        }
    }


}
