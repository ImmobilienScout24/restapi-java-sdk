//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.04.11 um 01:54:30 PM CEST 
//

package de.immobilienscout24.rest.schema.offer.toplisting._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * Liste von Toplistings
 * 
 * <p>
 * Java-Klasse f�r Toplistings complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Toplistings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="toplisting" type="{http://rest.immobilienscout24.de/schema/offer/toplisting/1.0}Toplisting" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}href"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Toplistings", propOrder = { "toplisting" })
public class Toplistings {

	protected List<Toplisting> toplisting;
	@XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
	@XmlSchemaType(name = "anyURI")
	protected String href;

	/**
	 * Gets the value of the toplisting property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the toplisting property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getToplisting().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link Toplisting }
	 * 
	 * 
	 */
	public List<Toplisting> getToplisting() {
		if (toplisting == null) {
			toplisting = new ArrayList<Toplisting>();
		}
		return this.toplisting;
	}

	/**
	 * Link zum Element.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHref() {
		return href;
	}

	/**
	 * Legt den Wert der href-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHref(String value) {
		this.href = value;
	}

}
