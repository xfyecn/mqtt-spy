//
// Copyright (c) 2015 Kamil Baczkowicz
//
// CSOFF: a.*
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Timestamp removed by maven-replacer-plugin to avoid detecting changes - see the project POM for details
//


package pl.baczkowicz.mqttspy.common.generated;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;
import pl.baczkowicz.spy.common.generated.Property;
import pl.baczkowicz.spy.common.generated.SecureSocketModeEnum;


/**
 * <p>Java class for SecureSocketSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecureSocketSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mode" type="{http://baczkowicz.pl/spy/common}SecureSocketModeEnum"/&gt;
 *         &lt;element name="Protocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CertificateAuthorityFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientCertificateFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientKeyFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientKeyPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientKeyPEM" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServerKeyStoreFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServerKeyStorePassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientKeyStoreFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientKeyStorePassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Property" type="{http://baczkowicz.pl/spy/common}Property" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
*/
@SuppressWarnings("all")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecureSocketSettings", propOrder = {
    "mode",
    "protocol",
    "certificateAuthorityFile",
    "clientCertificateFile",
    "clientKeyFile",
    "clientKeyPassword",
    "clientKeyPEM",
    "serverKeyStoreFile",
    "serverKeyStorePassword",
    "clientKeyStoreFile",
    "clientKeyStorePassword",
    "property"
})
public class SecureSocketSettings implements Serializable, Cloneable, CopyTo, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Mode", required = true)
    @XmlSchemaType(name = "string")
    protected SecureSocketModeEnum mode;
    @XmlElement(name = "Protocol")
    protected String protocol;
    @XmlElement(name = "CertificateAuthorityFile")
    protected String certificateAuthorityFile;
    @XmlElement(name = "ClientCertificateFile")
    protected String clientCertificateFile;
    @XmlElement(name = "ClientKeyFile")
    protected String clientKeyFile;
    @XmlElement(name = "ClientKeyPassword")
    protected String clientKeyPassword;
    @XmlElement(name = "ClientKeyPEM")
    protected Boolean clientKeyPEM;
    @XmlElement(name = "ServerKeyStoreFile")
    protected String serverKeyStoreFile;
    @XmlElement(name = "ServerKeyStorePassword")
    protected String serverKeyStorePassword;
    @XmlElement(name = "ClientKeyStoreFile")
    protected String clientKeyStoreFile;
    @XmlElement(name = "ClientKeyStorePassword")
    protected String clientKeyStorePassword;
    @XmlElement(name = "Property")
    protected List<Property> property;

    /**
     * Default no-arg constructor
     * 
     */
    public SecureSocketSettings() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SecureSocketSettings(final SecureSocketModeEnum mode, final String protocol, final String certificateAuthorityFile, final String clientCertificateFile, final String clientKeyFile, final String clientKeyPassword, final Boolean clientKeyPEM, final String serverKeyStoreFile, final String serverKeyStorePassword, final String clientKeyStoreFile, final String clientKeyStorePassword, final List<Property> property) {
        this.mode = mode;
        this.protocol = protocol;
        this.certificateAuthorityFile = certificateAuthorityFile;
        this.clientCertificateFile = clientCertificateFile;
        this.clientKeyFile = clientKeyFile;
        this.clientKeyPassword = clientKeyPassword;
        this.clientKeyPEM = clientKeyPEM;
        this.serverKeyStoreFile = serverKeyStoreFile;
        this.serverKeyStorePassword = serverKeyStorePassword;
        this.clientKeyStoreFile = clientKeyStoreFile;
        this.clientKeyStorePassword = clientKeyStorePassword;
        this.property = property;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link SecureSocketModeEnum }
     *     
     */
    public SecureSocketModeEnum getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecureSocketModeEnum }
     *     
     */
    public void setMode(SecureSocketModeEnum value) {
        this.mode = value;
    }

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocol(String value) {
        this.protocol = value;
    }

    /**
     * Gets the value of the certificateAuthorityFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateAuthorityFile() {
        return certificateAuthorityFile;
    }

    /**
     * Sets the value of the certificateAuthorityFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateAuthorityFile(String value) {
        this.certificateAuthorityFile = value;
    }

    /**
     * Gets the value of the clientCertificateFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientCertificateFile() {
        return clientCertificateFile;
    }

    /**
     * Sets the value of the clientCertificateFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientCertificateFile(String value) {
        this.clientCertificateFile = value;
    }

    /**
     * Gets the value of the clientKeyFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientKeyFile() {
        return clientKeyFile;
    }

    /**
     * Sets the value of the clientKeyFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientKeyFile(String value) {
        this.clientKeyFile = value;
    }

    /**
     * Gets the value of the clientKeyPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientKeyPassword() {
        return clientKeyPassword;
    }

    /**
     * Sets the value of the clientKeyPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientKeyPassword(String value) {
        this.clientKeyPassword = value;
    }

    /**
     * Gets the value of the clientKeyPEM property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClientKeyPEM() {
        return clientKeyPEM;
    }

    /**
     * Sets the value of the clientKeyPEM property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClientKeyPEM(Boolean value) {
        this.clientKeyPEM = value;
    }

    /**
     * Gets the value of the serverKeyStoreFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerKeyStoreFile() {
        return serverKeyStoreFile;
    }

    /**
     * Sets the value of the serverKeyStoreFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerKeyStoreFile(String value) {
        this.serverKeyStoreFile = value;
    }

    /**
     * Gets the value of the serverKeyStorePassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerKeyStorePassword() {
        return serverKeyStorePassword;
    }

    /**
     * Sets the value of the serverKeyStorePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerKeyStorePassword(String value) {
        this.serverKeyStorePassword = value;
    }

    /**
     * Gets the value of the clientKeyStoreFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientKeyStoreFile() {
        return clientKeyStoreFile;
    }

    /**
     * Sets the value of the clientKeyStoreFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientKeyStoreFile(String value) {
        this.clientKeyStoreFile = value;
    }

    /**
     * Gets the value of the clientKeyStorePassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientKeyStorePassword() {
        return clientKeyStorePassword;
    }

    /**
     * Sets the value of the clientKeyStorePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientKeyStorePassword(String value) {
        this.clientKeyStorePassword = value;
    }

    /**
     * Gets the value of the property property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Property }
     * 
     * 
     */
    public List<Property> getProperty() {
        if (property == null) {
            property = new ArrayList<Property>();
        }
        return this.property;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            SecureSocketModeEnum theMode;
            theMode = this.getMode();
            strategy.appendField(locator, this, "mode", buffer, theMode);
        }
        {
            String theProtocol;
            theProtocol = this.getProtocol();
            strategy.appendField(locator, this, "protocol", buffer, theProtocol);
        }
        {
            String theCertificateAuthorityFile;
            theCertificateAuthorityFile = this.getCertificateAuthorityFile();
            strategy.appendField(locator, this, "certificateAuthorityFile", buffer, theCertificateAuthorityFile);
        }
        {
            String theClientCertificateFile;
            theClientCertificateFile = this.getClientCertificateFile();
            strategy.appendField(locator, this, "clientCertificateFile", buffer, theClientCertificateFile);
        }
        {
            String theClientKeyFile;
            theClientKeyFile = this.getClientKeyFile();
            strategy.appendField(locator, this, "clientKeyFile", buffer, theClientKeyFile);
        }
        {
            String theClientKeyPassword;
            theClientKeyPassword = this.getClientKeyPassword();
            strategy.appendField(locator, this, "clientKeyPassword", buffer, theClientKeyPassword);
        }
        {
            Boolean theClientKeyPEM;
            theClientKeyPEM = this.isClientKeyPEM();
            strategy.appendField(locator, this, "clientKeyPEM", buffer, theClientKeyPEM);
        }
        {
            String theServerKeyStoreFile;
            theServerKeyStoreFile = this.getServerKeyStoreFile();
            strategy.appendField(locator, this, "serverKeyStoreFile", buffer, theServerKeyStoreFile);
        }
        {
            String theServerKeyStorePassword;
            theServerKeyStorePassword = this.getServerKeyStorePassword();
            strategy.appendField(locator, this, "serverKeyStorePassword", buffer, theServerKeyStorePassword);
        }
        {
            String theClientKeyStoreFile;
            theClientKeyStoreFile = this.getClientKeyStoreFile();
            strategy.appendField(locator, this, "clientKeyStoreFile", buffer, theClientKeyStoreFile);
        }
        {
            String theClientKeyStorePassword;
            theClientKeyStorePassword = this.getClientKeyStorePassword();
            strategy.appendField(locator, this, "clientKeyStorePassword", buffer, theClientKeyStorePassword);
        }
        {
            List<Property> theProperty;
            theProperty = (((this.property!= null)&&(!this.property.isEmpty()))?this.getProperty():null);
            strategy.appendField(locator, this, "property", buffer, theProperty);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SecureSocketSettings)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SecureSocketSettings that = ((SecureSocketSettings) object);
        {
            SecureSocketModeEnum lhsMode;
            lhsMode = this.getMode();
            SecureSocketModeEnum rhsMode;
            rhsMode = that.getMode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mode", lhsMode), LocatorUtils.property(thatLocator, "mode", rhsMode), lhsMode, rhsMode)) {
                return false;
            }
        }
        {
            String lhsProtocol;
            lhsProtocol = this.getProtocol();
            String rhsProtocol;
            rhsProtocol = that.getProtocol();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "protocol", lhsProtocol), LocatorUtils.property(thatLocator, "protocol", rhsProtocol), lhsProtocol, rhsProtocol)) {
                return false;
            }
        }
        {
            String lhsCertificateAuthorityFile;
            lhsCertificateAuthorityFile = this.getCertificateAuthorityFile();
            String rhsCertificateAuthorityFile;
            rhsCertificateAuthorityFile = that.getCertificateAuthorityFile();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "certificateAuthorityFile", lhsCertificateAuthorityFile), LocatorUtils.property(thatLocator, "certificateAuthorityFile", rhsCertificateAuthorityFile), lhsCertificateAuthorityFile, rhsCertificateAuthorityFile)) {
                return false;
            }
        }
        {
            String lhsClientCertificateFile;
            lhsClientCertificateFile = this.getClientCertificateFile();
            String rhsClientCertificateFile;
            rhsClientCertificateFile = that.getClientCertificateFile();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clientCertificateFile", lhsClientCertificateFile), LocatorUtils.property(thatLocator, "clientCertificateFile", rhsClientCertificateFile), lhsClientCertificateFile, rhsClientCertificateFile)) {
                return false;
            }
        }
        {
            String lhsClientKeyFile;
            lhsClientKeyFile = this.getClientKeyFile();
            String rhsClientKeyFile;
            rhsClientKeyFile = that.getClientKeyFile();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clientKeyFile", lhsClientKeyFile), LocatorUtils.property(thatLocator, "clientKeyFile", rhsClientKeyFile), lhsClientKeyFile, rhsClientKeyFile)) {
                return false;
            }
        }
        {
            String lhsClientKeyPassword;
            lhsClientKeyPassword = this.getClientKeyPassword();
            String rhsClientKeyPassword;
            rhsClientKeyPassword = that.getClientKeyPassword();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clientKeyPassword", lhsClientKeyPassword), LocatorUtils.property(thatLocator, "clientKeyPassword", rhsClientKeyPassword), lhsClientKeyPassword, rhsClientKeyPassword)) {
                return false;
            }
        }
        {
            Boolean lhsClientKeyPEM;
            lhsClientKeyPEM = this.isClientKeyPEM();
            Boolean rhsClientKeyPEM;
            rhsClientKeyPEM = that.isClientKeyPEM();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clientKeyPEM", lhsClientKeyPEM), LocatorUtils.property(thatLocator, "clientKeyPEM", rhsClientKeyPEM), lhsClientKeyPEM, rhsClientKeyPEM)) {
                return false;
            }
        }
        {
            String lhsServerKeyStoreFile;
            lhsServerKeyStoreFile = this.getServerKeyStoreFile();
            String rhsServerKeyStoreFile;
            rhsServerKeyStoreFile = that.getServerKeyStoreFile();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serverKeyStoreFile", lhsServerKeyStoreFile), LocatorUtils.property(thatLocator, "serverKeyStoreFile", rhsServerKeyStoreFile), lhsServerKeyStoreFile, rhsServerKeyStoreFile)) {
                return false;
            }
        }
        {
            String lhsServerKeyStorePassword;
            lhsServerKeyStorePassword = this.getServerKeyStorePassword();
            String rhsServerKeyStorePassword;
            rhsServerKeyStorePassword = that.getServerKeyStorePassword();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serverKeyStorePassword", lhsServerKeyStorePassword), LocatorUtils.property(thatLocator, "serverKeyStorePassword", rhsServerKeyStorePassword), lhsServerKeyStorePassword, rhsServerKeyStorePassword)) {
                return false;
            }
        }
        {
            String lhsClientKeyStoreFile;
            lhsClientKeyStoreFile = this.getClientKeyStoreFile();
            String rhsClientKeyStoreFile;
            rhsClientKeyStoreFile = that.getClientKeyStoreFile();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clientKeyStoreFile", lhsClientKeyStoreFile), LocatorUtils.property(thatLocator, "clientKeyStoreFile", rhsClientKeyStoreFile), lhsClientKeyStoreFile, rhsClientKeyStoreFile)) {
                return false;
            }
        }
        {
            String lhsClientKeyStorePassword;
            lhsClientKeyStorePassword = this.getClientKeyStorePassword();
            String rhsClientKeyStorePassword;
            rhsClientKeyStorePassword = that.getClientKeyStorePassword();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clientKeyStorePassword", lhsClientKeyStorePassword), LocatorUtils.property(thatLocator, "clientKeyStorePassword", rhsClientKeyStorePassword), lhsClientKeyStorePassword, rhsClientKeyStorePassword)) {
                return false;
            }
        }
        {
            List<Property> lhsProperty;
            lhsProperty = (((this.property!= null)&&(!this.property.isEmpty()))?this.getProperty():null);
            List<Property> rhsProperty;
            rhsProperty = (((that.property!= null)&&(!that.property.isEmpty()))?that.getProperty():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "property", lhsProperty), LocatorUtils.property(thatLocator, "property", rhsProperty), lhsProperty, rhsProperty)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            SecureSocketModeEnum theMode;
            theMode = this.getMode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mode", theMode), currentHashCode, theMode);
        }
        {
            String theProtocol;
            theProtocol = this.getProtocol();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "protocol", theProtocol), currentHashCode, theProtocol);
        }
        {
            String theCertificateAuthorityFile;
            theCertificateAuthorityFile = this.getCertificateAuthorityFile();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "certificateAuthorityFile", theCertificateAuthorityFile), currentHashCode, theCertificateAuthorityFile);
        }
        {
            String theClientCertificateFile;
            theClientCertificateFile = this.getClientCertificateFile();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clientCertificateFile", theClientCertificateFile), currentHashCode, theClientCertificateFile);
        }
        {
            String theClientKeyFile;
            theClientKeyFile = this.getClientKeyFile();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clientKeyFile", theClientKeyFile), currentHashCode, theClientKeyFile);
        }
        {
            String theClientKeyPassword;
            theClientKeyPassword = this.getClientKeyPassword();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clientKeyPassword", theClientKeyPassword), currentHashCode, theClientKeyPassword);
        }
        {
            Boolean theClientKeyPEM;
            theClientKeyPEM = this.isClientKeyPEM();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clientKeyPEM", theClientKeyPEM), currentHashCode, theClientKeyPEM);
        }
        {
            String theServerKeyStoreFile;
            theServerKeyStoreFile = this.getServerKeyStoreFile();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serverKeyStoreFile", theServerKeyStoreFile), currentHashCode, theServerKeyStoreFile);
        }
        {
            String theServerKeyStorePassword;
            theServerKeyStorePassword = this.getServerKeyStorePassword();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serverKeyStorePassword", theServerKeyStorePassword), currentHashCode, theServerKeyStorePassword);
        }
        {
            String theClientKeyStoreFile;
            theClientKeyStoreFile = this.getClientKeyStoreFile();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clientKeyStoreFile", theClientKeyStoreFile), currentHashCode, theClientKeyStoreFile);
        }
        {
            String theClientKeyStorePassword;
            theClientKeyStorePassword = this.getClientKeyStorePassword();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clientKeyStorePassword", theClientKeyStorePassword), currentHashCode, theClientKeyStorePassword);
        }
        {
            List<Property> theProperty;
            theProperty = (((this.property!= null)&&(!this.property.isEmpty()))?this.getProperty():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "property", theProperty), currentHashCode, theProperty);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof SecureSocketSettings) {
            final SecureSocketSettings copy = ((SecureSocketSettings) draftCopy);
            if (this.mode!= null) {
                SecureSocketModeEnum sourceMode;
                sourceMode = this.getMode();
                SecureSocketModeEnum copyMode = ((SecureSocketModeEnum) strategy.copy(LocatorUtils.property(locator, "mode", sourceMode), sourceMode));
                copy.setMode(copyMode);
            } else {
                copy.mode = null;
            }
            if (this.protocol!= null) {
                String sourceProtocol;
                sourceProtocol = this.getProtocol();
                String copyProtocol = ((String) strategy.copy(LocatorUtils.property(locator, "protocol", sourceProtocol), sourceProtocol));
                copy.setProtocol(copyProtocol);
            } else {
                copy.protocol = null;
            }
            if (this.certificateAuthorityFile!= null) {
                String sourceCertificateAuthorityFile;
                sourceCertificateAuthorityFile = this.getCertificateAuthorityFile();
                String copyCertificateAuthorityFile = ((String) strategy.copy(LocatorUtils.property(locator, "certificateAuthorityFile", sourceCertificateAuthorityFile), sourceCertificateAuthorityFile));
                copy.setCertificateAuthorityFile(copyCertificateAuthorityFile);
            } else {
                copy.certificateAuthorityFile = null;
            }
            if (this.clientCertificateFile!= null) {
                String sourceClientCertificateFile;
                sourceClientCertificateFile = this.getClientCertificateFile();
                String copyClientCertificateFile = ((String) strategy.copy(LocatorUtils.property(locator, "clientCertificateFile", sourceClientCertificateFile), sourceClientCertificateFile));
                copy.setClientCertificateFile(copyClientCertificateFile);
            } else {
                copy.clientCertificateFile = null;
            }
            if (this.clientKeyFile!= null) {
                String sourceClientKeyFile;
                sourceClientKeyFile = this.getClientKeyFile();
                String copyClientKeyFile = ((String) strategy.copy(LocatorUtils.property(locator, "clientKeyFile", sourceClientKeyFile), sourceClientKeyFile));
                copy.setClientKeyFile(copyClientKeyFile);
            } else {
                copy.clientKeyFile = null;
            }
            if (this.clientKeyPassword!= null) {
                String sourceClientKeyPassword;
                sourceClientKeyPassword = this.getClientKeyPassword();
                String copyClientKeyPassword = ((String) strategy.copy(LocatorUtils.property(locator, "clientKeyPassword", sourceClientKeyPassword), sourceClientKeyPassword));
                copy.setClientKeyPassword(copyClientKeyPassword);
            } else {
                copy.clientKeyPassword = null;
            }
            if (this.clientKeyPEM!= null) {
                Boolean sourceClientKeyPEM;
                sourceClientKeyPEM = this.isClientKeyPEM();
                Boolean copyClientKeyPEM = ((Boolean) strategy.copy(LocatorUtils.property(locator, "clientKeyPEM", sourceClientKeyPEM), sourceClientKeyPEM));
                copy.setClientKeyPEM(copyClientKeyPEM);
            } else {
                copy.clientKeyPEM = null;
            }
            if (this.serverKeyStoreFile!= null) {
                String sourceServerKeyStoreFile;
                sourceServerKeyStoreFile = this.getServerKeyStoreFile();
                String copyServerKeyStoreFile = ((String) strategy.copy(LocatorUtils.property(locator, "serverKeyStoreFile", sourceServerKeyStoreFile), sourceServerKeyStoreFile));
                copy.setServerKeyStoreFile(copyServerKeyStoreFile);
            } else {
                copy.serverKeyStoreFile = null;
            }
            if (this.serverKeyStorePassword!= null) {
                String sourceServerKeyStorePassword;
                sourceServerKeyStorePassword = this.getServerKeyStorePassword();
                String copyServerKeyStorePassword = ((String) strategy.copy(LocatorUtils.property(locator, "serverKeyStorePassword", sourceServerKeyStorePassword), sourceServerKeyStorePassword));
                copy.setServerKeyStorePassword(copyServerKeyStorePassword);
            } else {
                copy.serverKeyStorePassword = null;
            }
            if (this.clientKeyStoreFile!= null) {
                String sourceClientKeyStoreFile;
                sourceClientKeyStoreFile = this.getClientKeyStoreFile();
                String copyClientKeyStoreFile = ((String) strategy.copy(LocatorUtils.property(locator, "clientKeyStoreFile", sourceClientKeyStoreFile), sourceClientKeyStoreFile));
                copy.setClientKeyStoreFile(copyClientKeyStoreFile);
            } else {
                copy.clientKeyStoreFile = null;
            }
            if (this.clientKeyStorePassword!= null) {
                String sourceClientKeyStorePassword;
                sourceClientKeyStorePassword = this.getClientKeyStorePassword();
                String copyClientKeyStorePassword = ((String) strategy.copy(LocatorUtils.property(locator, "clientKeyStorePassword", sourceClientKeyStorePassword), sourceClientKeyStorePassword));
                copy.setClientKeyStorePassword(copyClientKeyStorePassword);
            } else {
                copy.clientKeyStorePassword = null;
            }
            if ((this.property!= null)&&(!this.property.isEmpty())) {
                List<Property> sourceProperty;
                sourceProperty = (((this.property!= null)&&(!this.property.isEmpty()))?this.getProperty():null);
                @SuppressWarnings("unchecked")
                List<Property> copyProperty = ((List<Property> ) strategy.copy(LocatorUtils.property(locator, "property", sourceProperty), sourceProperty));
                copy.property = null;
                if (copyProperty!= null) {
                    List<Property> uniquePropertyl = copy.getProperty();
                    uniquePropertyl.addAll(copyProperty);
                }
            } else {
                copy.property = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new SecureSocketSettings();
    }

}
