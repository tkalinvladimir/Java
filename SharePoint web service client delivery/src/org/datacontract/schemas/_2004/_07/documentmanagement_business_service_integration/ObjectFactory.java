
package org.datacontract.schemas._2004._07.documentmanagement_business_service_integration;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.documentmanagement_business_service_integration package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ArrayOfPurchaseRequestItemCreationDto_QNAME = new QName("http://schemas.datacontract.org/2004/07/DocumentManagement.Business.Service.Integration.Delivery", "ArrayOfPurchaseRequestItemCreationDto");
    private final static QName _PurchaseRequestCreationDto_QNAME = new QName("http://schemas.datacontract.org/2004/07/DocumentManagement.Business.Service.Integration.Delivery", "PurchaseRequestCreationDto");
    private final static QName _PurchaseOrderDto_QNAME = new QName("http://schemas.datacontract.org/2004/07/DocumentManagement.Business.Service.Integration.Delivery", "PurchaseOrderDto");
    private final static QName _PurchaseOrderItemUpdateDto_QNAME = new QName("http://schemas.datacontract.org/2004/07/DocumentManagement.Business.Service.Integration.Delivery", "PurchaseOrderItemUpdateDto");
    private final static QName _ArrayOfPurchaseOrderItemDto_QNAME = new QName("http://schemas.datacontract.org/2004/07/DocumentManagement.Business.Service.Integration.Delivery", "ArrayOfPurchaseOrderItemDto");
    private final static QName _PurchaseOrderUpdateDto_QNAME = new QName("http://schemas.datacontract.org/2004/07/DocumentManagement.Business.Service.Integration.Delivery", "PurchaseOrderUpdateDto");
    private final static QName _PurchaseOrderItemDto_QNAME = new QName("http://schemas.datacontract.org/2004/07/DocumentManagement.Business.Service.Integration.Delivery", "PurchaseOrderItemDto");
    private final static QName _PurchaseRequestItemCreationDto_QNAME = new QName("http://schemas.datacontract.org/2004/07/DocumentManagement.Business.Service.Integration.Delivery", "PurchaseRequestItemCreationDto");
    private final static QName _ArrayOfPurchaseOrderItemUpdateDto_QNAME = new QName("http://schemas.datacontract.org/2004/07/DocumentManagement.Business.Service.Integration.Delivery", "ArrayOfPurchaseOrderItemUpdateDto");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.documentmanagement_business_service_integration
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PurchaseOrderDto }
     * 
     */
    public PurchaseOrderDto createPurchaseOrderDto() {
        return new PurchaseOrderDto();
    }

    /**
     * Create an instance of {@link PurchaseOrderUpdateDto }
     * 
     */
    public PurchaseOrderUpdateDto createPurchaseOrderUpdateDto() {
        return new PurchaseOrderUpdateDto();
    }

    /**
     * Create an instance of {@link PurchaseRequestCreationDto }
     * 
     */
    public PurchaseRequestCreationDto createPurchaseRequestCreationDto() {
        return new PurchaseRequestCreationDto();
    }

    /**
     * Create an instance of {@link PurchaseOrderItemDto }
     * 
     */
    public PurchaseOrderItemDto createPurchaseOrderItemDto() {
        return new PurchaseOrderItemDto();
    }

    /**
     * Create an instance of {@link PurchaseRequestItemCreationDto }
     * 
     */
    public PurchaseRequestItemCreationDto createPurchaseRequestItemCreationDto() {
        return new PurchaseRequestItemCreationDto();
    }

    /**
     * Create an instance of {@link ArrayOfPurchaseOrderItemUpdateDto }
     * 
     */
    public ArrayOfPurchaseOrderItemUpdateDto createArrayOfPurchaseOrderItemUpdateDto() {
        return new ArrayOfPurchaseOrderItemUpdateDto();
    }

    /**
     * Create an instance of {@link ArrayOfPurchaseOrderItemDto }
     * 
     */
    public ArrayOfPurchaseOrderItemDto createArrayOfPurchaseOrderItemDto() {
        return new ArrayOfPurchaseOrderItemDto();
    }

    /**
     * Create an instance of {@link ArrayOfPurchaseRequestItemCreationDto }
     * 
     */
    public ArrayOfPurchaseRequestItemCreationDto createArrayOfPurchaseRequestItemCreationDto() {
        return new ArrayOfPurchaseRequestItemCreationDto();
    }

    /**
     * Create an instance of {@link PurchaseOrderItemUpdateDto }
     * 
     */
    public PurchaseOrderItemUpdateDto createPurchaseOrderItemUpdateDto() {
        return new PurchaseOrderItemUpdateDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPurchaseRequestItemCreationDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DocumentManagement.Business.Service.Integration.Delivery", name = "ArrayOfPurchaseRequestItemCreationDto")
    public JAXBElement<ArrayOfPurchaseRequestItemCreationDto> createArrayOfPurchaseRequestItemCreationDto(ArrayOfPurchaseRequestItemCreationDto value) {
        return new JAXBElement<ArrayOfPurchaseRequestItemCreationDto>(_ArrayOfPurchaseRequestItemCreationDto_QNAME, ArrayOfPurchaseRequestItemCreationDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseRequestCreationDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DocumentManagement.Business.Service.Integration.Delivery", name = "PurchaseRequestCreationDto")
    public JAXBElement<PurchaseRequestCreationDto> createPurchaseRequestCreationDto(PurchaseRequestCreationDto value) {
        return new JAXBElement<PurchaseRequestCreationDto>(_PurchaseRequestCreationDto_QNAME, PurchaseRequestCreationDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseOrderDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DocumentManagement.Business.Service.Integration.Delivery", name = "PurchaseOrderDto")
    public JAXBElement<PurchaseOrderDto> createPurchaseOrderDto(PurchaseOrderDto value) {
        return new JAXBElement<PurchaseOrderDto>(_PurchaseOrderDto_QNAME, PurchaseOrderDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseOrderItemUpdateDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DocumentManagement.Business.Service.Integration.Delivery", name = "PurchaseOrderItemUpdateDto")
    public JAXBElement<PurchaseOrderItemUpdateDto> createPurchaseOrderItemUpdateDto(PurchaseOrderItemUpdateDto value) {
        return new JAXBElement<PurchaseOrderItemUpdateDto>(_PurchaseOrderItemUpdateDto_QNAME, PurchaseOrderItemUpdateDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPurchaseOrderItemDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DocumentManagement.Business.Service.Integration.Delivery", name = "ArrayOfPurchaseOrderItemDto")
    public JAXBElement<ArrayOfPurchaseOrderItemDto> createArrayOfPurchaseOrderItemDto(ArrayOfPurchaseOrderItemDto value) {
        return new JAXBElement<ArrayOfPurchaseOrderItemDto>(_ArrayOfPurchaseOrderItemDto_QNAME, ArrayOfPurchaseOrderItemDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseOrderUpdateDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DocumentManagement.Business.Service.Integration.Delivery", name = "PurchaseOrderUpdateDto")
    public JAXBElement<PurchaseOrderUpdateDto> createPurchaseOrderUpdateDto(PurchaseOrderUpdateDto value) {
        return new JAXBElement<PurchaseOrderUpdateDto>(_PurchaseOrderUpdateDto_QNAME, PurchaseOrderUpdateDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseOrderItemDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DocumentManagement.Business.Service.Integration.Delivery", name = "PurchaseOrderItemDto")
    public JAXBElement<PurchaseOrderItemDto> createPurchaseOrderItemDto(PurchaseOrderItemDto value) {
        return new JAXBElement<PurchaseOrderItemDto>(_PurchaseOrderItemDto_QNAME, PurchaseOrderItemDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseRequestItemCreationDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DocumentManagement.Business.Service.Integration.Delivery", name = "PurchaseRequestItemCreationDto")
    public JAXBElement<PurchaseRequestItemCreationDto> createPurchaseRequestItemCreationDto(PurchaseRequestItemCreationDto value) {
        return new JAXBElement<PurchaseRequestItemCreationDto>(_PurchaseRequestItemCreationDto_QNAME, PurchaseRequestItemCreationDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPurchaseOrderItemUpdateDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DocumentManagement.Business.Service.Integration.Delivery", name = "ArrayOfPurchaseOrderItemUpdateDto")
    public JAXBElement<ArrayOfPurchaseOrderItemUpdateDto> createArrayOfPurchaseOrderItemUpdateDto(ArrayOfPurchaseOrderItemUpdateDto value) {
        return new JAXBElement<ArrayOfPurchaseOrderItemUpdateDto>(_ArrayOfPurchaseOrderItemUpdateDto_QNAME, ArrayOfPurchaseOrderItemUpdateDto.class, null, value);
    }

}
