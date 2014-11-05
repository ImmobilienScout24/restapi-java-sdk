//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.11.05 um 11:50:50 AM CET 
//


package de.immobilienscout24.rest.schema.common._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CareType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CareType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STATIONARY_CARE"/>
 *     &lt;enumeration value="DAY_CARE"/>
 *     &lt;enumeration value="SHORT_TERM_CARE"/>
 *     &lt;enumeration value="RESPITE_CARE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CareType")
@XmlEnum
public enum CareType {


    /**
     * Vollstationäre Pflege
     *                     
     * 
     */
    STATIONARY_CARE,

    /**
     * Tagespflege
     *                     
     * 
     */
    DAY_CARE,

    /**
     * Kurzzeitpflege
     *                     
     * 
     */
    SHORT_TERM_CARE,

    /**
     * Verhinderungspflege
     *                     
     * 
     */
    RESPITE_CARE;

    public String value() {
        return name();
    }

    public static CareType fromValue(String v) {
        return valueOf(v);
    }

}
