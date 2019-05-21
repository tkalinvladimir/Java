package ru.javarush.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface SimpleWebService {
    @WebMethod
    public String getMessage(String msg);
}
