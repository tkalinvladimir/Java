package com.javarush.task.task28.task2810.view;

import com.javarush.task.task28.task2810.Controller;
import com.javarush.task.task28.task2810.vo.Vacancy;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class HtmlView implements View {
    private Controller controller;
    private final String filePath = "./4.JavaCollections/src/" + this.getClass().getPackage().getName().replace('.', '/') + "/vacancies.html";
    @Override
    public void update(List<Vacancy> vacancies) {
        System.out.println(vacancies.size());
        try {
            String newFile = getUpdatedFileContent(vacancies);
            updateFile(newFile);
        }
        catch (Exception e){e.printStackTrace();}    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void userCitySelectEmulationMethod() {
        controller.onCitySelect("Odessa");
    }

    private String getUpdatedFileContent(List<Vacancy> list){
        Document doc;
        try {
            doc = getDocument();

            Elements elementVacancy = doc.getElementsByAttributeValue("class", "vacancy");
            for (int i=0;i<elementVacancy.size();i++){
                elementVacancy.get(i).remove();
            }

            Element templateElement = doc.getElementsByClass("template").first();
            Element cloneTemplateElement = templateElement.clone();
            cloneTemplateElement.removeClass("template");
            cloneTemplateElement.removeAttr("style");

            Vacancy vacancy;

            for (int i=0;i<list.size();i++){
                vacancy = list.get(i);
                Element e = cloneTemplateElement.clone();

                //add city
                e.getElementsByClass("city").first().text(vacancy.getCity());
                // add companyName
                e.getElementsByClass("companyName").first().text(vacancy.getCompanyName());
                // add salary
                e.getElementsByClass("salary").first().text(vacancy.getSalary());
                //add url
                Element elementLink = e.getElementsByClass("title").first();
                elementLink.text(vacancy.getTitle());
                elementLink.attr("href", vacancy.getUrl());

                templateElement.before(e.outerHtml());
            }
        } catch (IOException e) {
            e.printStackTrace();
            return "Some exception occurred";



        }
        return doc.toString();
    }

    protected Document getDocument() throws IOException{

        return Jsoup.parse(new File(filePath), "UTF-8");
    }


    private void updateFile(String s) {

        try (FileOutputStream outputStream = new FileOutputStream(filePath)){
            outputStream.write(s.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
