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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Kriterien f�r die Regionssuche
 * 
 * Generelles Element f�r die Geo Criterias
 * 
 * <p>Java-Klasse f�r RegionCriteria complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RegionCriteria">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/common/1.0}AbstractGeoCriteria">
 *       &lt;sequence>
 *         &lt;element name="geoInfoNodeCriteria" type="{http://rest.immobilienscout24.de/schema/common/1.0}GeoInfoNodeCriteria" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegionCriteria", propOrder = {
    "geoInfoNodeCriteria"
})
public class RegionCriteria
    extends AbstractGeoCriteria
{

    @XmlElement(required = true)
    protected List<GeoInfoNodeCriteria> geoInfoNodeCriteria;

    /**
     * Gets the value of the geoInfoNodeCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geoInfoNodeCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeoInfoNodeCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeoInfoNodeCriteria }
     * 
     * 
     */
    public List<GeoInfoNodeCriteria> getGeoInfoNodeCriteria() {
        if (geoInfoNodeCriteria == null) {
            geoInfoNodeCriteria = new ArrayList<GeoInfoNodeCriteria>();
        }
        return this.geoInfoNodeCriteria;
    }

}
