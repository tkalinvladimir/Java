
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.documentmanagement_business_service_integration.PurchaseOrderUpdateDto;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="updateDto" type="{http://schemas.datacontract.org/2004/07/DocumentManagement.Business.Service.Integration.Delivery}PurchaseOrderUpdateDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "updateDto"
})
@XmlRootElement(name = "UpdateDeliveryDate")
public class UpdateDeliveryDate {

    @XmlElement(nillable = true)
    protected PurchaseOrderUpdateDto updateDto;

    /**
     * Gets the value of the updateDto property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderUpdateDto }
     *     
     */
    public PurchaseOrderUpdateDto getUpdateDto() {
        return updateDto;
    }

    /**
     * Sets the value of the updateDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderUpdateDto }
     *     
     */
    public void setUpdateDto(PurchaseOrderUpdateDto value) {
        this.updateDto = value;
    }

}
