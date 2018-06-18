package com.javarush.task.task28.task2810.model;

import com.javarush.task.task28.task2810.vo.Vacancy;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MoikrugStrategy implements Strategy {

    private static final String URL_FORMAT = "https://moikrug.ru/vacancies?q=java+%s&page=%d";

    @Override
    public List<Vacancy> getVacancies(String searchString) {
        List<Vacancy> vacancies = new ArrayList<>();
        if (searchString == null)
            return Collections.emptyList();

        int j = 0;
        while (true) {
            try {
                Document doc = getDocument(searchString, j++);
                Elements elements = doc.getElementsByClass("Job");
                if (elements.size() > 1){
                    for (int i = 0; i < elements.size(); i++) {
                        String siteName = "https://moikrug.ru";
                        Vacancy vacancy = new Vacancy();

                        // title
                        String title = elements.get(i).getElementsByClass("title").text();
                        vacancy.setTitle(title);

                        // salary
                        String salary = elements.get(i).getElementsByClass("salary").text();
                        if (salary != null)
                            vacancy.setSalary(salary);
                        else vacancy.setSalary("");

                        // city
                        String city = elements.get(i).getElementsByClass("location").text();
                        if (city != null)
                            vacancy.setCity(city);
                        else vacancy.setCity("");

                        // companyName
                        String companyName = elements.get(i).getElementsByClass("company_name").text();
                        vacancy.setCompanyName(companyName);

                        // url;
                        String url = elements.get(i).getElementsByClass("title").first().child(0).attr("href");
                        vacancy.setUrl(siteName+url);

                        // siteNa
                        vacancy.setSiteName(siteName);

                        vacancies.add(vacancy);
                    }
                }
                else break;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return vacancies;
    }

    //получение объекта Document html-страницы.
    protected Document getDocument(String searchString, int page) throws IOException{
        String url = String.format(URL_FORMAT, searchString, page);
        Document doc = Jsoup.connect(url).userAgent("Chrome/57.0.2987.133 (jsoup)").referrer("?").get();
        return doc;
    }
}