package com.javarush.task.test;

import javax.mail.Session;
import javax.mail.internet.MimeMessage;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Properties;
public class test {
    public static void main(String[] args) throws JAXBException
    {
        //создание объекта для сериализации в XML
        Cat cat = new Cat();
        cat.name = "Murka";
        cat.age = 5;
        cat.weight = 4;

        //писать результат сериализации будем в Writer(StringWriter)
        StringWriter writer = new StringWriter();

        //создание объекта Marshaller, который выполняет сериализацию
        JAXBContext context = JAXBContext.newInstance(Cat.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        // сама сериализация
        marshaller.marshal(cat, writer);

        //преобразовываем в строку все записанное в StringWriter
        String result = writer.toString();
        System.out.println(result);




        String xmldata = "<cat><name>Murka</name><age>5</age><weight>666</weight></cat>";
        StringReader reader = new StringReader(xmldata);

        context = JAXBContext.newInstance(Cat.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();

        cat = (Cat) unmarshaller.unmarshal(reader);
        System.out.println(cat);

        Properties props = new Properties();
        props.put("mail.transport.protocol", "smtps");
        props.put("mail.smtps.host", "smtp.gmail.com");
        props.put("mail.smtps.auth", "true");
        props.put("mail.smtp.sendpartial", "true");

        Session session = Session.getDefaultInstance(props);
//создаем сообщение
        MimeMessage message = new MimeMessage(session);

    }
}
