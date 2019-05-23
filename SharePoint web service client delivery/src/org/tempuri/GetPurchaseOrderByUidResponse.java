
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
 *         &lt;element name="GetPurchaseOrderByUidResult" type="{http://schemas.datacontract.org/2004/07/DocumentManagement.Business.Service.Integration.Delivery}PurchaseOrderDto" minOccurs="0"/>
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
    "getPurchaseOrderByUidResult"
})
@XmlRootElement(name = "GetPurchaseOrderByUidResponse")
public class GetPurchaseOrderByUidResponse {

    @XmlElement(name = "GetPurchaseOrderByUidResult", nillable = true)
    protected PurchaseOrderDto getPurchaseOrderByUidResult;

    /**
     * Gets the value of the getPurchaseOrderByUidResult property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderDto }
     *     
     */
    public PurchaseOrderDto getGetPurchaseOrderByUidResult() {
        return getPurchaseOrderByUidResult;
    }

    /**
     * Sets the value of the getPurchaseOrderByUidResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderDto }
     *     
     */
    public void setGetPurchaseOrderByUidResult(PurchaseOrderDto value) {
        this.getPurchaseOrderByUidResult = value;
    }

}
