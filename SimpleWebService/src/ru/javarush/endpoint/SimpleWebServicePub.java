package ru.javarush.endpoint;

import ru.javarush.ws.SimpleWebServiceImpl;

import javax.xml.ws.Endpoint;

public class SimpleWebServicePub {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:1986/wss/simple", new SimpleWebServiceImpl());
    }
}
