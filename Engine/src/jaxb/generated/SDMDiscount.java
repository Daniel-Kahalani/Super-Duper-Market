//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.10.13 at 04:48:21 PM IDT 
//


package jaxb.generated;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element ref="{}name"/>
 *         &lt;element ref="{}if-you-buy"/>
 *         &lt;element ref="{}then-you-get"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "SDM-discount")
public class SDMDiscount {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "if-you-buy", required = true)
    protected IfYouBuy ifYouBuy;
    @XmlElement(name = "then-you-get", required = true)
    protected ThenYouGet thenYouGet;

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
     * Gets the value of the ifYouBuy property.
     * 
     * @return
     *     possible object is
     *     {@link IfYouBuy }
     *     
     */
    public IfYouBuy getIfYouBuy() {
        return ifYouBuy;
    }

    /**
     * Sets the value of the ifYouBuy property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfYouBuy }
     *     
     */
    public void setIfYouBuy(IfYouBuy value) {
        this.ifYouBuy = value;
    }

    /**
     * Gets the value of the thenYouGet property.
     * 
     * @return
     *     possible object is
     *     {@link ThenYouGet }
     *     
     */
    public ThenYouGet getThenYouGet() {
        return thenYouGet;
    }

    /**
     * Sets the value of the thenYouGet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThenYouGet }
     *     
     */
    public void setThenYouGet(ThenYouGet value) {
        this.thenYouGet = value;
    }

}
