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
 * Java-Klasse f�r ForwardTrackingType.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="ForwardTrackingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DIRECT"/>
 *     &lt;enumeration value="LATER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ForwardTrackingType")
@XmlEnum
public enum ForwardTrackingType {

	/**
	 * Indicates that the customer was forwarded to us by a partner/affiliate
	 * within the current session.
	 * 
	 * 
	 */
	DIRECT,

	/**
	 * Indicates that the customer was forwarded to us by a partner/affiliate
	 * previously and has now returned independently of the partner/affiliate.
	 * 
	 * 
	 */
	LATER;

	public String value() {
		return name();
	}

	public static ForwardTrackingType fromValue(String v) {
		return valueOf(v);
	}

}
