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
 * Java-Klasse f�r LocationClassificationType.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="LocationClassificationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_INFORMATION"/>
 *     &lt;enumeration value="CLASSIFICATION_A"/>
 *     &lt;enumeration value="CLASSIFICATION_B"/>
 *     &lt;enumeration value="SHOPPING_CENTRE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LocationClassificationType")
@XmlEnum
public enum LocationClassificationType {

	/**
	 * Keine Angabe
	 * 
	 */
	NO_INFORMATION,

	/**
	 * A-Lage
	 * 
	 */
	CLASSIFICATION_A,

	/**
	 * B-Lage
	 * 
	 */
	CLASSIFICATION_B,

	/**
	 * im Schoppingcenter
	 * 
	 */
	SHOPPING_CENTRE;

	public String value() {
		return name();
	}

	public static LocationClassificationType fromValue(String v) {
		return valueOf(v);
	}

}