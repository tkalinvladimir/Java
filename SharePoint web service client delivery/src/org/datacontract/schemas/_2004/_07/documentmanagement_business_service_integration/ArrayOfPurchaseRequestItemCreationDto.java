
package org.datacontract.schemas._2004._07.documentmanagement_business_service_integration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPurchaseRequestItemCreationDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPurchaseRequestItemCreationDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PurchaseRequestItemCreationDto" type="{http://schemas.datacontract.org/2004/07/DocumentManagement.Business.Service.Integration.Delivery}PurchaseRequestItemCreationDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPurchaseRequestItemCreationDto", propOrder = {
    "purchaseRequestItemCreationDto"
})
public class ArrayOfPurchaseRequestItemCreationDto {

    @XmlElement(name = "PurchaseRequestItemCreationDto", nillable = true)
    protected List<PurchaseRequestItemCreationDto> purchaseRequestItemCreationDto;

    /**
     * Gets the value of the purchaseRequestItemCreationDto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchaseRequestItemCreationDto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchaseRequestItemCreationDto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PurchaseRequestItemCreationDto }
     * 
     * 
     */
    public List<PurchaseRequestItemCreationDto> getPurchaseRequestItemCreationDto() {
        if (purchaseRequestItemCreationDto == null) {
            purchaseRequestItemCreationDto = new ArrayList<PurchaseRequestItemCreationDto>();
        }
        return this.purchaseRequestItemCreationDto;
    }

}
