
package org.datacontract.schemas._2004._07.documentmanagement_business_service_integration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PurchaseOrderItemDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaseOrderItemDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Delivered" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="DeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Nomenclature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NomenclatureCode1C" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="SupplierNomencalture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Uid" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchaseOrderItemDto", propOrder = {
    "cost",
    "delivered",
    "deliveryDate",
    "nomenclature",
    "nomenclatureCode1C",
    "quantity",
    "supplierNomencalture",
    "uid"
})
public class PurchaseOrderItemDto {

    @XmlElement(name = "Cost")
    protected BigDecimal cost;
    @XmlElement(name = "Delivered")
    protected Float delivered;
    @XmlElement(name = "DeliveryDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deliveryDate;
    @XmlElement(name = "Nomenclature", nillable = true)
    protected String nomenclature;
    @XmlElement(name = "NomenclatureCode1C", nillable = true)
    protected String nomenclatureCode1C;
    @XmlElement(name = "Quantity")
    protected Float quantity;
    @XmlElement(name = "SupplierNomencalture", nillable = true)
    protected String supplierNomencalture;
    @XmlElement(name = "Uid")
    protected String uid;

    /**
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCost(BigDecimal value) {
        this.cost = value;
    }

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
     * Gets the value of the deliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Sets the value of the deliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryDate(XMLGregorianCalendar value) {
        this.deliveryDate = value;
    }

    /**
     * Gets the value of the nomenclature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomenclature() {
        return nomenclature;
    }

    /**
     * Sets the value of the nomenclature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomenclature(String value) {
        this.nomenclature = value;
    }

    /**
     * Gets the value of the nomenclatureCode1C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomenclatureCode1C() {
        return nomenclatureCode1C;
    }

    /**
     * Sets the value of the nomenclatureCode1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomenclatureCode1C(String value) {
        this.nomenclatureCode1C = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setQuantity(Float value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the supplierNomencalture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierNomencalture() {
        return supplierNomencalture;
    }

    /**
     * Sets the value of the supplierNomencalture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierNomencalture(String value) {
        this.supplierNomencalture = value;
    }

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUid(String value) {
        this.uid = value;
    }

}
