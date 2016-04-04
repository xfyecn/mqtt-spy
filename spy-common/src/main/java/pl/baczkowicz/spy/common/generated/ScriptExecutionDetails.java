//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.04 at 11:07:26 PM BST 
//


package pl.baczkowicz.spy.common.generated;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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


/**
 * <p>Java class for ScriptExecutionDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScriptExecutionDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InlineScript" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScriptExecutionDetails", propOrder = {
    "inlineScript"
})
public class ScriptExecutionDetails implements Serializable, Cloneable, CopyTo, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "InlineScript", required = true)
    protected String inlineScript;

    /**
     * Default no-arg constructor
     * 
     */
    public ScriptExecutionDetails() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ScriptExecutionDetails(final String inlineScript) {
        this.inlineScript = inlineScript;
    }

    /**
     * Gets the value of the inlineScript property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInlineScript() {
        return inlineScript;
    }

    /**
     * Sets the value of the inlineScript property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInlineScript(String value) {
        this.inlineScript = value;
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
            String theInlineScript;
            theInlineScript = this.getInlineScript();
            strategy.appendField(locator, this, "inlineScript", buffer, theInlineScript);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ScriptExecutionDetails)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ScriptExecutionDetails that = ((ScriptExecutionDetails) object);
        {
            String lhsInlineScript;
            lhsInlineScript = this.getInlineScript();
            String rhsInlineScript;
            rhsInlineScript = that.getInlineScript();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inlineScript", lhsInlineScript), LocatorUtils.property(thatLocator, "inlineScript", rhsInlineScript), lhsInlineScript, rhsInlineScript)) {
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
            String theInlineScript;
            theInlineScript = this.getInlineScript();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inlineScript", theInlineScript), currentHashCode, theInlineScript);
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
        if (draftCopy instanceof ScriptExecutionDetails) {
            final ScriptExecutionDetails copy = ((ScriptExecutionDetails) draftCopy);
            if (this.inlineScript!= null) {
                String sourceInlineScript;
                sourceInlineScript = this.getInlineScript();
                String copyInlineScript = ((String) strategy.copy(LocatorUtils.property(locator, "inlineScript", sourceInlineScript), sourceInlineScript));
                copy.setInlineScript(copyInlineScript);
            } else {
                copy.inlineScript = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ScriptExecutionDetails();
    }

}
