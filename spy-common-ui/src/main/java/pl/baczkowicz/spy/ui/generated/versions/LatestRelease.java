//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.03 at 08:21:22 PM BST 
//


package pl.baczkowicz.spy.ui.generated.versions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
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


/**
 * <p>Java class for LatestRelease complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LatestRelease"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="KeyFeatures" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DownloadLocation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LatestRelease", propOrder = {
    "version",
    "name",
    "date",
    "keyFeatures",
    "downloadLocation"
})
public class LatestRelease
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElement(name = "Version", required = true)
    protected String version;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "KeyFeatures", required = true)
    protected String keyFeatures;
    @XmlElement(name = "DownloadLocation", required = true)
    protected String downloadLocation;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the keyFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyFeatures() {
        return keyFeatures;
    }

    /**
     * Sets the value of the keyFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyFeatures(String value) {
        this.keyFeatures = value;
    }

    /**
     * Gets the value of the downloadLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDownloadLocation() {
        return downloadLocation;
    }

    /**
     * Sets the value of the downloadLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDownloadLocation(String value) {
        this.downloadLocation = value;
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
            String theVersion;
            theVersion = this.getVersion();
            strategy.appendField(locator, this, "version", buffer, theVersion);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            XMLGregorianCalendar theDate;
            theDate = this.getDate();
            strategy.appendField(locator, this, "date", buffer, theDate);
        }
        {
            String theKeyFeatures;
            theKeyFeatures = this.getKeyFeatures();
            strategy.appendField(locator, this, "keyFeatures", buffer, theKeyFeatures);
        }
        {
            String theDownloadLocation;
            theDownloadLocation = this.getDownloadLocation();
            strategy.appendField(locator, this, "downloadLocation", buffer, theDownloadLocation);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof LatestRelease)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LatestRelease that = ((LatestRelease) object);
        {
            String lhsVersion;
            lhsVersion = this.getVersion();
            String rhsVersion;
            rhsVersion = that.getVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "version", lhsVersion), LocatorUtils.property(thatLocator, "version", rhsVersion), lhsVersion, rhsVersion)) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsDate;
            lhsDate = this.getDate();
            XMLGregorianCalendar rhsDate;
            rhsDate = that.getDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "date", lhsDate), LocatorUtils.property(thatLocator, "date", rhsDate), lhsDate, rhsDate)) {
                return false;
            }
        }
        {
            String lhsKeyFeatures;
            lhsKeyFeatures = this.getKeyFeatures();
            String rhsKeyFeatures;
            rhsKeyFeatures = that.getKeyFeatures();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "keyFeatures", lhsKeyFeatures), LocatorUtils.property(thatLocator, "keyFeatures", rhsKeyFeatures), lhsKeyFeatures, rhsKeyFeatures)) {
                return false;
            }
        }
        {
            String lhsDownloadLocation;
            lhsDownloadLocation = this.getDownloadLocation();
            String rhsDownloadLocation;
            rhsDownloadLocation = that.getDownloadLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "downloadLocation", lhsDownloadLocation), LocatorUtils.property(thatLocator, "downloadLocation", rhsDownloadLocation), lhsDownloadLocation, rhsDownloadLocation)) {
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
            String theVersion;
            theVersion = this.getVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "version", theVersion), currentHashCode, theVersion);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            XMLGregorianCalendar theDate;
            theDate = this.getDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "date", theDate), currentHashCode, theDate);
        }
        {
            String theKeyFeatures;
            theKeyFeatures = this.getKeyFeatures();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "keyFeatures", theKeyFeatures), currentHashCode, theKeyFeatures);
        }
        {
            String theDownloadLocation;
            theDownloadLocation = this.getDownloadLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "downloadLocation", theDownloadLocation), currentHashCode, theDownloadLocation);
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
        if (draftCopy instanceof LatestRelease) {
            final LatestRelease copy = ((LatestRelease) draftCopy);
            if (this.version!= null) {
                String sourceVersion;
                sourceVersion = this.getVersion();
                String copyVersion = ((String) strategy.copy(LocatorUtils.property(locator, "version", sourceVersion), sourceVersion));
                copy.setVersion(copyVersion);
            } else {
                copy.version = null;
            }
            if (this.name!= null) {
                String sourceName;
                sourceName = this.getName();
                String copyName = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceName), sourceName));
                copy.setName(copyName);
            } else {
                copy.name = null;
            }
            if (this.date!= null) {
                XMLGregorianCalendar sourceDate;
                sourceDate = this.getDate();
                XMLGregorianCalendar copyDate = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "date", sourceDate), sourceDate));
                copy.setDate(copyDate);
            } else {
                copy.date = null;
            }
            if (this.keyFeatures!= null) {
                String sourceKeyFeatures;
                sourceKeyFeatures = this.getKeyFeatures();
                String copyKeyFeatures = ((String) strategy.copy(LocatorUtils.property(locator, "keyFeatures", sourceKeyFeatures), sourceKeyFeatures));
                copy.setKeyFeatures(copyKeyFeatures);
            } else {
                copy.keyFeatures = null;
            }
            if (this.downloadLocation!= null) {
                String sourceDownloadLocation;
                sourceDownloadLocation = this.getDownloadLocation();
                String copyDownloadLocation = ((String) strategy.copy(LocatorUtils.property(locator, "downloadLocation", sourceDownloadLocation), sourceDownloadLocation));
                copy.setDownloadLocation(copyDownloadLocation);
            } else {
                copy.downloadLocation = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new LatestRelease();
    }

}
