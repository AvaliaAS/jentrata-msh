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
 *         &lt;element name="TransportSecurityProtocol" type="{http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd}protocol.type"/>
 *         &lt;element name="ClientCertificateRef" type="{http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd}CertificateRef.type" minOccurs="0"/>
 *         &lt;element name="ServerSecurityDetailsRef" type="{http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd}SecurityDetailsRef.type" minOccurs="0"/>
 *         &lt;element ref="{http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd}EncryptionAlgorithm" maxOccurs="unbounded" minOccurs="0"/>
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
    "transportSecurityProtocol",
    "clientCertificateRef",
    "serverSecurityDetailsRef",
    "encryptionAlgorithm"
})
@XmlRootElement(name = "TransportClientSecurity")
public class TransportClientSecurity {

    @XmlElement(name = "TransportSecurityProtocol", required = true)
    protected ProtocolType transportSecurityProtocol;
    @XmlElement(name = "ClientCertificateRef")
    protected CertificateRefType clientCertificateRef;
    @XmlElement(name = "ServerSecurityDetailsRef")
    protected SecurityDetailsRefType serverSecurityDetailsRef;
    @XmlElement(name = "EncryptionAlgorithm")
    protected List<EncryptionAlgorithm> encryptionAlgorithm;

    /**
     * Gets the value of the transportSecurityProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolType }
     *     
     */
    public ProtocolType getTransportSecurityProtocol() {
        return transportSecurityProtocol;
    }

    /**
     * Sets the value of the transportSecurityProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolType }
     *     
     */
    public void setTransportSecurityProtocol(ProtocolType value) {
        this.transportSecurityProtocol = value;
    }

    /**
     * Gets the value of the clientCertificateRef property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateRefType }
     *     
     */
    public CertificateRefType getClientCertificateRef() {
        return clientCertificateRef;
    }

    /**
     * Sets the value of the clientCertificateRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateRefType }
     *     
     */
    public void setClientCertificateRef(CertificateRefType value) {
        this.clientCertificateRef = value;
    }

    /**
     * Gets the value of the serverSecurityDetailsRef property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityDetailsRefType }
     *     
     */
    public SecurityDetailsRefType getServerSecurityDetailsRef() {
        return serverSecurityDetailsRef;
    }

    /**
     * Sets the value of the serverSecurityDetailsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityDetailsRefType }
     *     
     */
    public void setServerSecurityDetailsRef(SecurityDetailsRefType value) {
        this.serverSecurityDetailsRef = value;
    }

    /**
     * Gets the value of the encryptionAlgorithm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the encryptionAlgorithm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEncryptionAlgorithm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EncryptionAlgorithm }
     * 
     * 
     */
    public List<EncryptionAlgorithm> getEncryptionAlgorithm() {
        if (encryptionAlgorithm == null) {
            encryptionAlgorithm = new ArrayList<EncryptionAlgorithm>();
        }
        return this.encryptionAlgorithm;
    }

}
