package ru.javarush.ws;

import ru.javarush.ws.SimpleWebService;

import javax.jws.WebService;

@WebService(endpointInterface = "ru.javarush.ws.SimpleWebService")
public class SimpleWebServiceImpl implements SimpleWebService {
    @Override
    public String getMessage(String msg) {
        return "you wrote: "+msg;
    }
}
