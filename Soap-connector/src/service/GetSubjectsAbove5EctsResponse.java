
package service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSubjectsAbove5EctsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSubjectsAbove5EctsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subjectsAbove5Ects" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="subjectAbove5ects" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSubjectsAbove5EctsResponse", propOrder = {
    "subjectsAbove5Ects"
})
public class GetSubjectsAbove5EctsResponse {

    protected GetSubjectsAbove5EctsResponse.SubjectsAbove5Ects subjectsAbove5Ects;

    /**
     * Gets the value of the subjectsAbove5Ects property.
     * 
     * @return
     *     possible object is
     *     {@link GetSubjectsAbove5EctsResponse.SubjectsAbove5Ects }
     *     
     */
    public GetSubjectsAbove5EctsResponse.SubjectsAbove5Ects getSubjectsAbove5Ects() {
        return subjectsAbove5Ects;
    }

    /**
     * Sets the value of the subjectsAbove5Ects property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSubjectsAbove5EctsResponse.SubjectsAbove5Ects }
     *     
     */
    public void setSubjectsAbove5Ects(GetSubjectsAbove5EctsResponse.SubjectsAbove5Ects value) {
        this.subjectsAbove5Ects = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="subjectAbove5ects" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "subjectAbove5Ects"
    })
    public static class SubjectsAbove5Ects {

        @XmlElement(name = "subjectAbove5ects")
        protected List<String> subjectAbove5Ects;

        /**
         * Gets the value of the subjectAbove5Ects property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subjectAbove5Ects property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubjectAbove5Ects().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSubjectAbove5Ects() {
            if (subjectAbove5Ects == null) {
                subjectAbove5Ects = new ArrayList<String>();
            }
            return this.subjectAbove5Ects;
        }

    }

}
