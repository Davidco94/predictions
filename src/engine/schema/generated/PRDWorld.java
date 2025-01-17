//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source engine.schema.
// Generated on: 2023.08.04 at 11:53:02 AM IDT 
//


package engine.schema.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following engine.schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}PRD-evironment"/>
 *         &lt;element ref="{}PRD-entities"/>
 *         &lt;element ref="{}PRD-rules"/>
 *         &lt;element ref="{}PRD-termination"/>
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
    "prdEvironment",
    "prdEntities",
    "prdRules",
    "prdTermination"
})
@XmlRootElement(name = "PRD-world")
public class PRDWorld {

    @XmlElement(name = "PRD-evironment", required = true)
    protected PRDEvironment prdEvironment;
    @XmlElement(name = "PRD-entities", required = true)
    protected PRDEntities prdEntities;
    @XmlElement(name = "PRD-rules", required = true)
    protected PRDRules prdRules;
    @XmlElement(name = "PRD-termination", required = true)
    protected PRDTermination prdTermination;

    /**
     * Gets the value of the prdEvironment property.
     * 
     * @return
     *     possible object is
     *     {@link PRDEvironment }
     *     
     */
    public PRDEvironment getPRDEvironment() {
        return prdEvironment;
    }

    /**
     * Sets the value of the prdEvironment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRDEvironment }
     *     
     */
    public void setPRDEvironment(PRDEvironment value) {
        this.prdEvironment = value;
    }

    /**
     * Gets the value of the prdEntities property.
     * 
     * @return
     *     possible object is
     *     {@link PRDEntities }
     *     
     */
    public PRDEntities getPRDEntities() {
        return prdEntities;
    }

    /**
     * Sets the value of the prdEntities property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRDEntities }
     *     
     */
    public void setPRDEntities(PRDEntities value) {
        this.prdEntities = value;
    }

    /**
     * Gets the value of the prdRules property.
     * 
     * @return
     *     possible object is
     *     {@link PRDRules }
     *     
     */
    public PRDRules getPRDRules() {
        return prdRules;
    }

    /**
     * Sets the value of the prdRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRDRules }
     *     
     */
    public void setPRDRules(PRDRules value) {
        this.prdRules = value;
    }

    /**
     * Gets the value of the prdTermination property.
     * 
     * @return
     *     possible object is
     *     {@link PRDTermination }
     *     
     */
    public PRDTermination getPRDTermination() {
        return prdTermination;
    }

    /**
     * Sets the value of the prdTermination property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRDTermination }
     *     
     */
    public void setPRDTermination(PRDTermination value) {
        this.prdTermination = value;
    }

}
