
package org.datacontract.schemas._2004._07.documentmanagement_business_service_integration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchaseOrderUpdateDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaseOrderUpdateDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdatedItems" type="{http://schemas.datacontract.org/2004/07/DocumentManagement.Business.Service.Integration.Delivery}ArrayOfPurchaseOrderItemUpdateDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchaseOrderUpdateDto", propOrder = {
    "code",
    "updatedItems"
})
public class PurchaseOrderUpdateDto {

    @XmlElement(name = "Code", nillable = true)
    protected String code;
    @XmlElement(name = "UpdatedItems", nillable = true)
    protected ArrayOfPurchaseOrderItemUpdateDto updatedItems;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the updatedItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPurchaseOrderItemUpdateDto }
     *     
     */
    public ArrayOfPurchaseOrderItemUpdateDto getUpdatedItems() {
        return updatedItems;
    }

    /**
     * Sets the value of the updatedItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPurchaseOrderItemUpdateDto }
     *     
     */
    public void setUpdatedItems(ArrayOfPurchaseOrderItemUpdateDto value) {
        this.updatedItems = value;
    }

}
