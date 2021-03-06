
package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.datacontract.schemas._2004._07.documentmanagement_business_service_integration.PurchaseOrderDto;
import org.datacontract.schemas._2004._07.documentmanagement_business_service_integration.PurchaseOrderUpdateDto;
import org.datacontract.schemas._2004._07.documentmanagement_business_service_integration.PurchaseRequestCreationDto;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IDeliveryWebService", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    com.microsoft.schemas._2003._10.serialization.ObjectFactory.class,
    org.datacontract.schemas._2004._07.documentmanagement_business_service_integration.ObjectFactory.class,
    org.tempuri.ObjectFactory.class
})
public interface IDeliveryWebService {


    /**
     * 
     * @param code
     * @return
     *     returns org.datacontract.schemas._2004._07.documentmanagement_business_service_integration.PurchaseOrderDto
     */
    @WebMethod(operationName = "GetPurchaseOrder", action = "http://tempuri.org/IDeliveryWebService/GetPurchaseOrder")
    @WebResult(name = "GetPurchaseOrderResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetPurchaseOrder", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetPurchaseOrder")
    @ResponseWrapper(localName = "GetPurchaseOrderResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetPurchaseOrderResponse")
    public PurchaseOrderDto getPurchaseOrder(
        @WebParam(name = "code", targetNamespace = "http://tempuri.org/")
        String code);

    /**
     * 
     * @param uid
     * @return
     *     returns org.datacontract.schemas._2004._07.documentmanagement_business_service_integration.PurchaseOrderDto
     */
    @WebMethod(operationName = "GetPurchaseOrderByUid", action = "http://tempuri.org/IDeliveryWebService/GetPurchaseOrderByUid")
    @WebResult(name = "GetPurchaseOrderByUidResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetPurchaseOrderByUid", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetPurchaseOrderByUid")
    @ResponseWrapper(localName = "GetPurchaseOrderByUidResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetPurchaseOrderByUidResponse")
    public PurchaseOrderDto getPurchaseOrderByUid(
        @WebParam(name = "uid", targetNamespace = "http://tempuri.org/")
        String uid);

    /**
     * 
     * @param updateDto
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "UpdateDeliveryDate", action = "http://tempuri.org/IDeliveryWebService/UpdateDeliveryDate")
    @WebResult(name = "UpdateDeliveryDateResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "UpdateDeliveryDate", targetNamespace = "http://tempuri.org/", className = "org.tempuri.UpdateDeliveryDate")
    @ResponseWrapper(localName = "UpdateDeliveryDateResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.UpdateDeliveryDateResponse")
    public String updateDeliveryDate(
        @WebParam(name = "updateDto", targetNamespace = "http://tempuri.org/")
        PurchaseOrderUpdateDto updateDto);

    /**
     * 
     * @param dto
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CreatePurchaseRequest", action = "http://tempuri.org/IDeliveryWebService/CreatePurchaseRequest")
    @WebResult(name = "CreatePurchaseRequestResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CreatePurchaseRequest", targetNamespace = "http://tempuri.org/", className = "org.tempuri.CreatePurchaseRequest")
    @ResponseWrapper(localName = "CreatePurchaseRequestResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.CreatePurchaseRequestResponse")
    public String createPurchaseRequest(
        @WebParam(name = "dto", targetNamespace = "http://tempuri.org/")
        PurchaseRequestCreationDto dto);

}
