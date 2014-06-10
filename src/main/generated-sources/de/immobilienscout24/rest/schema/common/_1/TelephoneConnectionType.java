//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.04.11 um 01:54:30 PM CEST 
//

package de.immobilienscout24.rest.schema.common._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse f�r TelephoneConnectionType.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="TelephoneConnectionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_INFORMATION"/>
 *     &lt;enumeration value="ANALOG"/>
 *     &lt;enumeration value="ISDN"/>
 *     &lt;enumeration value="NOT_AVAILABLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TelephoneConnectionType")
@XmlEnum
public enum TelephoneConnectionType {

	/**
	 * Keine Angabe
	 * 
	 */
	NO_INFORMATION,

	/**
	 * Analog
	 * 
	 */
	ANALOG,

	/**
	 * ISDN
	 * 
	 */
	ISDN,

	/**
	 * nicht verf�gbar
	 * 
	 */
	NOT_AVAILABLE;

	public String value() {
		return name();
	}

	public static TelephoneConnectionType fromValue(String v) {
		return valueOf(v);
	}

}
