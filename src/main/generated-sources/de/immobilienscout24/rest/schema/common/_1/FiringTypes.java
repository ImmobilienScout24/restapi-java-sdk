//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.04.19 um 09:36:45 AM CEST 
//


package de.immobilienscout24.rest.schema.common._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Befeuerungsarten
 * 
 * <p>Java-Klasse f�r FiringTypes complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FiringTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firingType" type="{http://rest.immobilienscout24.de/schema/common/1.0}FiringType" maxOccurs="10" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FiringTypes", propOrder = {
    "firingType"
})
public class FiringTypes {

    protected List<FiringType> firingType;

    /**
     * Gets the value of the firingType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the firingType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFiringType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FiringType }
     * 
     * 
     */
    public List<FiringType> getFiringType() {
        if (firingType == null) {
            firingType = new ArrayList<FiringType>();
        }
        return this.firingType;
    }

}
