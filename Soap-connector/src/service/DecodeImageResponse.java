
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for decodeImageResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="decodeImageResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="binaryDownload" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "decodeImageResponse", propOrder = {
    "binaryDownload"
})
public class DecodeImageResponse {

    protected byte[] binaryDownload;

    /**
     * Gets the value of the binaryDownload property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBinaryDownload() {
        return binaryDownload;
    }

    /**
     * Sets the value of the binaryDownload property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBinaryDownload(byte[] value) {
        this.binaryDownload = value;
    }

}
