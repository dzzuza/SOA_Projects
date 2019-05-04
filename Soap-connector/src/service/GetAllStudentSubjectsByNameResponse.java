
package service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAllStudentSubjectsByNameResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAllStudentSubjectsByNameResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subjectsByName" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="subjectName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "getAllStudentSubjectsByNameResponse", propOrder = {
    "subjectsByName"
})
public class GetAllStudentSubjectsByNameResponse {

    protected GetAllStudentSubjectsByNameResponse.SubjectsByName subjectsByName;

    /**
     * Gets the value of the subjectsByName property.
     * 
     * @return
     *     possible object is
     *     {@link GetAllStudentSubjectsByNameResponse.SubjectsByName }
     *     
     */
    public GetAllStudentSubjectsByNameResponse.SubjectsByName getSubjectsByName() {
        return subjectsByName;
    }

    /**
     * Sets the value of the subjectsByName property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAllStudentSubjectsByNameResponse.SubjectsByName }
     *     
     */
    public void setSubjectsByName(GetAllStudentSubjectsByNameResponse.SubjectsByName value) {
        this.subjectsByName = value;
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
     *         &lt;element name="subjectName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "subjectName"
    })
    public static class SubjectsByName {

        protected List<String> subjectName;

        /**
         * Gets the value of the subjectName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subjectName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubjectName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSubjectName() {
            if (subjectName == null) {
                subjectName = new ArrayList<String>();
            }
            return this.subjectName;
        }

    }

}
