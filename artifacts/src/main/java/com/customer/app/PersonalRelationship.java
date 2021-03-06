//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.11 at 03:31:19 PM UYT 
//


package com.customer.app;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Personal Relationship - This Role identifies a Person to whom the originating Person is related in some way
 * 
 *                 Patient - Subscriber
 *                 Patient - Parent ( Father/Mother) 
 * 
 * <p>Java class for PersonalRelationship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonalRelationship"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="relationshipcategorycode" type="{http://www.app.customer.com}Code" minOccurs="0"/&gt;
 *         &lt;element name="effectivedaterange" type="{http://www.app.customer.com}TimeInterval" minOccurs="0"/&gt;
 *         &lt;element name="Person" type="{http://www.app.customer.com}Person" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonalRelationship", propOrder = {
    "relationshipcategorycode",
    "effectivedaterange",
    "person"
})
@XmlRootElement(name = "PersonalRelationship")
public class PersonalRelationship
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected Code relationshipcategorycode;
    protected TimeInterval effectivedaterange;
    @XmlElement(name = "Person")
    protected Person person;

    /**
     * Gets the value of the relationshipcategorycode property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getRelationshipcategorycode() {
        return relationshipcategorycode;
    }

    /**
     * Sets the value of the relationshipcategorycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setRelationshipcategorycode(Code value) {
        this.relationshipcategorycode = value;
    }

    /**
     * Gets the value of the effectivedaterange property.
     * 
     * @return
     *     possible object is
     *     {@link TimeInterval }
     *     
     */
    public TimeInterval getEffectivedaterange() {
        return effectivedaterange;
    }

    /**
     * Sets the value of the effectivedaterange property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInterval }
     *     
     */
    public void setEffectivedaterange(TimeInterval value) {
        this.effectivedaterange = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPerson(Person value) {
        this.person = value;
    }

}
