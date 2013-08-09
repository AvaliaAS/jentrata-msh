//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.09 at 10:45:26 AM EST 
//


package org.jentrata.ebxml.cpa;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AnchorCertificateRef" type="{http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd}CertificateRef.type" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "anchorCertificateRef"
})
@XmlRootElement(name = "TrustAnchors")
public class TrustAnchors {

    @XmlElement(name = "AnchorCertificateRef", required = true)
    protected List<CertificateRefType> anchorCertificateRef;

    /**
     * Gets the value of the anchorCertificateRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anchorCertificateRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnchorCertificateRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CertificateRefType }
     * 
     * 
     */
    public List<CertificateRefType> getAnchorCertificateRef() {
        if (anchorCertificateRef == null) {
            anchorCertificateRef = new ArrayList<CertificateRefType>();
        }
        return this.anchorCertificateRef;
    }

}
