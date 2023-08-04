//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.08.04 at 11:53:02 AM IDT 
//


package predictions.schema.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the predictions.schema.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PRDName_QNAME = new QName("", "PRD-name");
    private final static QName _PRDPopulation_QNAME = new QName("", "PRD-population");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: predictions.schema.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PRDValue }
     * 
     */
    public PRDValue createPRDValue() {
        return new PRDValue();
    }

    /**
     * Create an instance of {@link PRDMultiply }
     * 
     */
    public PRDMultiply createPRDMultiply() {
        return new PRDMultiply();
    }

    /**
     * Create an instance of {@link PRDProperties }
     * 
     */
    public PRDProperties createPRDProperties() {
        return new PRDProperties();
    }

    /**
     * Create an instance of {@link PRDProperty }
     * 
     */
    public PRDProperty createPRDProperty() {
        return new PRDProperty();
    }

    /**
     * Create an instance of {@link PRDRange }
     * 
     */
    public PRDRange createPRDRange() {
        return new PRDRange();
    }

    /**
     * Create an instance of {@link PRDBySecond }
     * 
     */
    public PRDBySecond createPRDBySecond() {
        return new PRDBySecond();
    }

    /**
     * Create an instance of {@link PRDEntity }
     * 
     */
    public PRDEntity createPRDEntity() {
        return new PRDEntity();
    }

    /**
     * Create an instance of {@link PRDEntities }
     * 
     */
    public PRDEntities createPRDEntities() {
        return new PRDEntities();
    }

    /**
     * Create an instance of {@link PRDDivide }
     * 
     */
    public PRDDivide createPRDDivide() {
        return new PRDDivide();
    }

    /**
     * Create an instance of {@link PRDTermination }
     * 
     */
    public PRDTermination createPRDTermination() {
        return new PRDTermination();
    }

    /**
     * Create an instance of {@link PRDByTicks }
     * 
     */
    public PRDByTicks createPRDByTicks() {
        return new PRDByTicks();
    }

    /**
     * Create an instance of {@link PRDRule }
     * 
     */
    public PRDRule createPRDRule() {
        return new PRDRule();
    }

    /**
     * Create an instance of {@link PRDActions }
     * 
     */
    public PRDActions createPRDActions() {
        return new PRDActions();
    }

    /**
     * Create an instance of {@link PRDAction }
     * 
     */
    public PRDAction createPRDAction() {
        return new PRDAction();
    }

    /**
     * Create an instance of {@link PRDCondition }
     * 
     */
    public PRDCondition createPRDCondition() {
        return new PRDCondition();
    }

    /**
     * Create an instance of {@link PRDThen }
     * 
     */
    public PRDThen createPRDThen() {
        return new PRDThen();
    }

    /**
     * Create an instance of {@link PRDElse }
     * 
     */
    public PRDElse createPRDElse() {
        return new PRDElse();
    }

    /**
     * Create an instance of {@link PRDActivation }
     * 
     */
    public PRDActivation createPRDActivation() {
        return new PRDActivation();
    }

    /**
     * Create an instance of {@link PRDWorld }
     * 
     */
    public PRDWorld createPRDWorld() {
        return new PRDWorld();
    }

    /**
     * Create an instance of {@link PRDEvironment }
     * 
     */
    public PRDEvironment createPRDEvironment() {
        return new PRDEvironment();
    }

    /**
     * Create an instance of {@link PRDEnvProperty }
     * 
     */
    public PRDEnvProperty createPRDEnvProperty() {
        return new PRDEnvProperty();
    }

    /**
     * Create an instance of {@link PRDRules }
     * 
     */
    public PRDRules createPRDRules() {
        return new PRDRules();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRD-name")
    public JAXBElement<String> createPRDName(String value) {
        return new JAXBElement<String>(_PRDName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRD-population")
    public JAXBElement<Integer> createPRDPopulation(Integer value) {
        return new JAXBElement<Integer>(_PRDPopulation_QNAME, Integer.class, null, value);
    }

}
