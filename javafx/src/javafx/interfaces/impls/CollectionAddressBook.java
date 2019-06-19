package javafx.interfaces.impls;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.interfaces.AddressBook;
import javafx.objects.Person;

import java.util.ArrayList;

public class CollectionAddressBook implements AddressBook {

    private ObservableList<Person> personList = FXCollections.observableArrayList();


    @Override
    public void add(Person person) {
        personList.add(person);
    }

    @Override
    public void update(Person person) {

    }

    @Override
    public void delete(Person person) {
        personList.remove(person);
    }

    public ObservableList<Person> getPersonList() {
        return personList;
    }

    public void print() {
        int num = 0;
        System.out.println();
        for (Person person:personList) {
            System.out.println(num+") fio = "+person.getFio()+"; phone = "+person.getPhone());
        }
    }

    public void fillTestData() {
        personList.add(new Person("Vova", "89644407917"));
        personList.add(new Person("Kate", "89644413131"));
    }
}
