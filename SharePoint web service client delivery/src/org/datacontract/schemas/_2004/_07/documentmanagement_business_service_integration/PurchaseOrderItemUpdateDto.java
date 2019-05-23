
package org.datacontract.schemas._2004._07.documentmanagement_business_service_integration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchaseOrderItemUpdateDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaseOrderItemUpdateDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Delivered" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="ItemId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchaseOrderItemUpdateDto", propOrder = {
    "delivered",
    "itemId"
})
public class PurchaseOrderItemUpdateDto {

    @XmlElement(name = "Delivered")
    protected Float delivered;
    @XmlElement(name = "ItemId")
    protected String itemId;

    /**
     * Gets the value of the delivered property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDelivered() {
        return delivered;
    }

    /**
     * Sets the value of the delivered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDelivered(Float value) {
        this.delivered = value;
    }

    /**
     * Gets the value of the itemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemId(String value) {
        this.itemId = value;
    }

}
