
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for encodeFileToBase64BinaryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="encodeFileToBase64BinaryResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="binaryUpload" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "encodeFileToBase64BinaryResponse", propOrder = {
    "binaryUpload"
})
public class EncodeFileToBase64BinaryResponse {

    protected String binaryUpload;

    /**
     * Gets the value of the binaryUpload property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinaryUpload() {
        return binaryUpload;
    }

    /**
     * Sets the value of the binaryUpload property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinaryUpload(String value) {
        this.binaryUpload = value;
    }

}
