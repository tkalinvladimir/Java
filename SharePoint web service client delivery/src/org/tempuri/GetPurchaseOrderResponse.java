
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.documentmanagement_business_service_integration.PurchaseOrderDto;


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
 *         &lt;element name="GetPurchaseOrderResult" type="{http://schemas.datacontract.org/2004/07/DocumentManagement.Business.Service.Integration.Delivery}PurchaseOrderDto" minOccurs="0"/>
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
    "getPurchaseOrderResult"
})
@XmlRootElement(name = "GetPurchaseOrderResponse")
public class GetPurchaseOrderResponse {

    @XmlElement(name = "GetPurchaseOrderResult", nillable = true)
    protected PurchaseOrderDto getPurchaseOrderResult;

    /**
     * Gets the value of the getPurchaseOrderResult property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderDto }
     *     
     */
    public PurchaseOrderDto getGetPurchaseOrderResult() {
        return getPurchaseOrderResult;
    }

    /**
     * Sets the value of the getPurchaseOrderResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderDto }
     *     
     */
    public void setGetPurchaseOrderResult(PurchaseOrderDto value) {
        this.getPurchaseOrderResult = value;
    }

}
