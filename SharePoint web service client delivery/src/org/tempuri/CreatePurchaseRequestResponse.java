
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="CreatePurchaseRequestResult" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
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
    "createPurchaseRequestResult"
})
@XmlRootElement(name = "CreatePurchaseRequestResponse")
public class CreatePurchaseRequestResponse {

    @XmlElement(name = "CreatePurchaseRequestResult")
    protected String createPurchaseRequestResult;

    /**
     * Gets the value of the createPurchaseRequestResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatePurchaseRequestResult() {
        return createPurchaseRequestResult;
    }

    /**
     * Sets the value of the createPurchaseRequestResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatePurchaseRequestResult(String value) {
        this.createPurchaseRequestResult = value;
    }

}
