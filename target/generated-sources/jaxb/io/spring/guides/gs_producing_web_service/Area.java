//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.02.27 at 11:46:57 AM CST 
//


package io.spring.guides.gs_producing_web_service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for area complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="area"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kilometers" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="miles" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "area", propOrder = {
    "kilometers",
    "miles"
})
public class Area {

    protected int kilometers;
    protected int miles;

    /**
     * Gets the value of the kilometers property.
     * 
     */
    public int getKilometers() {
        return kilometers;
    }

    /**
     * Sets the value of the kilometers property.
     * 
     */
    public void setKilometers(int value) {
        this.kilometers = value;
    }

    /**
     * Gets the value of the miles property.
     * 
     */
    public int getMiles() {
        return miles;
    }

    /**
     * Sets the value of the miles property.
     * 
     */
    public void setMiles(int value) {
        this.miles = value;
    }

}
