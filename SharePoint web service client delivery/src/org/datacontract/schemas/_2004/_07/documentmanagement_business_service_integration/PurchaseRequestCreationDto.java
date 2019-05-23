
package org.datacontract.schemas._2004._07.documentmanagement_business_service_integration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchaseRequestCreationDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaseRequestCreationDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AuthorLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BudgetOwnerLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemList" type="{http://schemas.datacontract.org/2004/07/DocumentManagement.Business.Service.Integration.Delivery}ArrayOfPurchaseRequestItemCreationDto" minOccurs="0"/>
 *         &lt;element name="ManagerLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Specification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchaseRequestCreationDto", propOrder = {
    "authorLogin",
    "budgetOwnerLogin",
    "itemList",
    "managerLogin",
    "specification"
})
public class PurchaseRequestCreationDto {

    @XmlElement(name = "AuthorLogin", nillable = true)
    protected String authorLogin;
    @XmlElement(name = "BudgetOwnerLogin", nillable = true)
    protected String budgetOwnerLogin;
    @XmlElement(name = "ItemList", nillable = true)
    protected ArrayOfPurchaseRequestItemCreationDto itemList;
    @XmlElement(name = "ManagerLogin", nillable = true)
    protected String managerLogin;
    @XmlElement(name = "Specification", nillable = true)
    protected String specification;

    /**
     * Gets the value of the authorLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorLogin() {
        return authorLogin;
    }

    /**
     * Sets the value of the authorLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorLogin(String value) {
        this.authorLogin = value;
    }

    /**
     * Gets the value of the budgetOwnerLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBudgetOwnerLogin() {
        return budgetOwnerLogin;
    }

    /**
     * Sets the value of the budgetOwnerLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBudgetOwnerLogin(String value) {
        this.budgetOwnerLogin = value;
    }

    /**
     * Gets the value of the itemList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPurchaseRequestItemCreationDto }
     *     
     */
    public ArrayOfPurchaseRequestItemCreationDto getItemList() {
        return itemList;
    }

    /**
     * Sets the value of the itemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPurchaseRequestItemCreationDto }
     *     
     */
    public void setItemList(ArrayOfPurchaseRequestItemCreationDto value) {
        this.itemList = value;
    }

    /**
     * Gets the value of the managerLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerLogin() {
        return managerLogin;
    }

    /**
     * Sets the value of the managerLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerLogin(String value) {
        this.managerLogin = value;
    }

    /**
     * Gets the value of the specification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecification() {
        return specification;
    }

    /**
     * Sets the value of the specification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecification(String value) {
        this.specification = value;
    }

}
