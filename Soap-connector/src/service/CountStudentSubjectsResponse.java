
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for countStudentSubjectsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="countStudentSubjectsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subjectsNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "countStudentSubjectsResponse", propOrder = {
    "subjectsNumber"
})
public class CountStudentSubjectsResponse {

    protected int subjectsNumber;

    /**
     * Gets the value of the subjectsNumber property.
     * 
     */
    public int getSubjectsNumber() {
        return subjectsNumber;
    }

    /**
     * Sets the value of the subjectsNumber property.
     * 
     */
    public void setSubjectsNumber(int value) {
        this.subjectsNumber = value;
    }

}
