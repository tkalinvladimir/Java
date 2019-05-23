
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.documentmanagement_business_service_integration.PurchaseRequestCreationDto;


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
 *         &lt;element name="dto" type="{http://schemas.datacontract.org/2004/07/DocumentManagement.Business.Service.Integration.Delivery}PurchaseRequestCreationDto" minOccurs="0"/>
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
    "dto"
})
@XmlRootElement(name = "CreatePurchaseRequest")
public class CreatePurchaseRequest {

    @XmlElement(nillable = true)
    protected PurchaseRequestCreationDto dto;

    /**
     * Gets the value of the dto property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseRequestCreationDto }
     *     
     */
    public PurchaseRequestCreationDto getDto() {
        return dto;
    }

    /**
     * Sets the value of the dto property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseRequestCreationDto }
     *     
     */
    public void setDto(PurchaseRequestCreationDto value) {
        this.dto = value;
    }

}
