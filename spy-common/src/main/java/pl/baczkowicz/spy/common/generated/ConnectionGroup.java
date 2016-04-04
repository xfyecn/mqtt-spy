//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.04 at 11:07:26 PM BST 
//


package pl.baczkowicz.spy.common.generated;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * <p>Java class for ConnectionGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectionGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}ID"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Subgroups" type="{http://baczkowicz.pl/spy/common}ConnectionGroupReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Connections" type="{http://baczkowicz.pl/spy/common}ConnectionReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionGroup", propOrder = {
    "id",
    "name",
    "subgroups",
    "connections"
})
public class ConnectionGroup implements Serializable, Cloneable, CopyTo, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Subgroups")
    protected List<ConnectionGroupReference> subgroups;
    @XmlElement(name = "Connections")
    protected List<ConnectionReference> connections;

    /**
     * Default no-arg constructor
     * 
     */
    public ConnectionGroup() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ConnectionGroup(final String id, final String name, final List<ConnectionGroupReference> subgroups, final List<ConnectionReference> connections) {
        this.id = id;
        this.name = name;
        this.subgroups = subgroups;
        this.connections = connections;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
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
     * Gets the value of the subgroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subgroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubgroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectionGroupReference }
     * 
     * 
     */
    public List<ConnectionGroupReference> getSubgroups() {
        if (subgroups == null) {
            subgroups = new ArrayList<ConnectionGroupReference>();
        }
        return this.subgroups;
    }

    /**
     * Gets the value of the connections property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connections property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnections().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectionReference }
     * 
     * 
     */
    public List<ConnectionReference> getConnections() {
        if (connections == null) {
            connections = new ArrayList<ConnectionReference>();
        }
        return this.connections;
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
            String theID;
            theID = this.getID();
            strategy.appendField(locator, this, "id", buffer, theID);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            List<ConnectionGroupReference> theSubgroups;
            theSubgroups = (((this.subgroups!= null)&&(!this.subgroups.isEmpty()))?this.getSubgroups():null);
            strategy.appendField(locator, this, "subgroups", buffer, theSubgroups);
        }
        {
            List<ConnectionReference> theConnections;
            theConnections = (((this.connections!= null)&&(!this.connections.isEmpty()))?this.getConnections():null);
            strategy.appendField(locator, this, "connections", buffer, theConnections);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ConnectionGroup)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ConnectionGroup that = ((ConnectionGroup) object);
        {
            String lhsID;
            lhsID = this.getID();
            String rhsID;
            rhsID = that.getID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsID), LocatorUtils.property(thatLocator, "id", rhsID), lhsID, rhsID)) {
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
            List<ConnectionGroupReference> lhsSubgroups;
            lhsSubgroups = (((this.subgroups!= null)&&(!this.subgroups.isEmpty()))?this.getSubgroups():null);
            List<ConnectionGroupReference> rhsSubgroups;
            rhsSubgroups = (((that.subgroups!= null)&&(!that.subgroups.isEmpty()))?that.getSubgroups():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subgroups", lhsSubgroups), LocatorUtils.property(thatLocator, "subgroups", rhsSubgroups), lhsSubgroups, rhsSubgroups)) {
                return false;
            }
        }
        {
            List<ConnectionReference> lhsConnections;
            lhsConnections = (((this.connections!= null)&&(!this.connections.isEmpty()))?this.getConnections():null);
            List<ConnectionReference> rhsConnections;
            rhsConnections = (((that.connections!= null)&&(!that.connections.isEmpty()))?that.getConnections():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "connections", lhsConnections), LocatorUtils.property(thatLocator, "connections", rhsConnections), lhsConnections, rhsConnections)) {
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
            String theID;
            theID = this.getID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theID), currentHashCode, theID);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            List<ConnectionGroupReference> theSubgroups;
            theSubgroups = (((this.subgroups!= null)&&(!this.subgroups.isEmpty()))?this.getSubgroups():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subgroups", theSubgroups), currentHashCode, theSubgroups);
        }
        {
            List<ConnectionReference> theConnections;
            theConnections = (((this.connections!= null)&&(!this.connections.isEmpty()))?this.getConnections():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "connections", theConnections), currentHashCode, theConnections);
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
        if (draftCopy instanceof ConnectionGroup) {
            final ConnectionGroup copy = ((ConnectionGroup) draftCopy);
            if (this.id!= null) {
                String sourceID;
                sourceID = this.getID();
                String copyID = ((String) strategy.copy(LocatorUtils.property(locator, "id", sourceID), sourceID));
                copy.setID(copyID);
            } else {
                copy.id = null;
            }
            if (this.name!= null) {
                String sourceName;
                sourceName = this.getName();
                String copyName = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceName), sourceName));
                copy.setName(copyName);
            } else {
                copy.name = null;
            }
            if ((this.subgroups!= null)&&(!this.subgroups.isEmpty())) {
                List<ConnectionGroupReference> sourceSubgroups;
                sourceSubgroups = (((this.subgroups!= null)&&(!this.subgroups.isEmpty()))?this.getSubgroups():null);
                @SuppressWarnings("unchecked")
                List<ConnectionGroupReference> copySubgroups = ((List<ConnectionGroupReference> ) strategy.copy(LocatorUtils.property(locator, "subgroups", sourceSubgroups), sourceSubgroups));
                copy.subgroups = null;
                if (copySubgroups!= null) {
                    List<ConnectionGroupReference> uniqueSubgroupsl = copy.getSubgroups();
                    uniqueSubgroupsl.addAll(copySubgroups);
                }
            } else {
                copy.subgroups = null;
            }
            if ((this.connections!= null)&&(!this.connections.isEmpty())) {
                List<ConnectionReference> sourceConnections;
                sourceConnections = (((this.connections!= null)&&(!this.connections.isEmpty()))?this.getConnections():null);
                @SuppressWarnings("unchecked")
                List<ConnectionReference> copyConnections = ((List<ConnectionReference> ) strategy.copy(LocatorUtils.property(locator, "connections", sourceConnections), sourceConnections));
                copy.connections = null;
                if (copyConnections!= null) {
                    List<ConnectionReference> uniqueConnectionsl = copy.getConnections();
                    uniqueConnectionsl.addAll(copyConnections);
                }
            } else {
                copy.connections = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ConnectionGroup();
    }

}
