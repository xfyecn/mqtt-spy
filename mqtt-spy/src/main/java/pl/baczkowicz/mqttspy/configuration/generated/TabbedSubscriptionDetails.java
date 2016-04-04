//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.04 at 11:07:31 PM BST 
//


package pl.baczkowicz.mqttspy.configuration.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
import pl.baczkowicz.mqttspy.common.generated.SubscriptionDetails;


/**
 * <p>Java class for TabbedSubscriptionDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TabbedSubscriptionDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://baczkowicz.pl/mqtt-spy/common}SubscriptionDetails"&gt;
 *       &lt;attribute name="createTab" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TabbedSubscriptionDetails")
public class TabbedSubscriptionDetails
    extends SubscriptionDetails
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlAttribute(name = "createTab")
    protected Boolean createTab;

    /**
     * Default no-arg constructor
     * 
     */
    public TabbedSubscriptionDetails() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TabbedSubscriptionDetails(final Boolean createTab) {
        this.createTab = createTab;
    }

    /**
     * Gets the value of the createTab property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCreateTab() {
        if (createTab == null) {
            return false;
        } else {
            return createTab;
        }
    }

    /**
     * Sets the value of the createTab property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreateTab(Boolean value) {
        this.createTab = value;
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
        super.appendFields(locator, buffer, strategy);
        {
            boolean theCreateTab;
            theCreateTab = ((this.createTab!= null)?this.isCreateTab():false);
            strategy.appendField(locator, this, "createTab", buffer, theCreateTab);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TabbedSubscriptionDetails)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final TabbedSubscriptionDetails that = ((TabbedSubscriptionDetails) object);
        {
            boolean lhsCreateTab;
            lhsCreateTab = ((this.createTab!= null)?this.isCreateTab():false);
            boolean rhsCreateTab;
            rhsCreateTab = ((that.createTab!= null)?that.isCreateTab():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "createTab", lhsCreateTab), LocatorUtils.property(thatLocator, "createTab", rhsCreateTab), lhsCreateTab, rhsCreateTab)) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            boolean theCreateTab;
            theCreateTab = ((this.createTab!= null)?this.isCreateTab():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "createTab", theCreateTab), currentHashCode, theCreateTab);
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
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof TabbedSubscriptionDetails) {
            final TabbedSubscriptionDetails copy = ((TabbedSubscriptionDetails) draftCopy);
            if (this.createTab!= null) {
                boolean sourceCreateTab;
                sourceCreateTab = ((this.createTab!= null)?this.isCreateTab():false);
                boolean copyCreateTab = strategy.copy(LocatorUtils.property(locator, "createTab", sourceCreateTab), sourceCreateTab);
                copy.setCreateTab(copyCreateTab);
            } else {
                copy.createTab = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new TabbedSubscriptionDetails();
    }

}
