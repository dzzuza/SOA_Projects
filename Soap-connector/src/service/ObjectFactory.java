
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
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

    private final static QName _GetAllStudentSubjectsByName_QNAME = new QName("http://Service/", "getAllStudentSubjectsByName");
    private final static QName _ClearSubjects_QNAME = new QName("http://Service/", "clearSubjects");
    private final static QName _AddSubject_QNAME = new QName("http://Service/", "addSubject");
    private final static QName _GetSubjectsAbove5Ects_QNAME = new QName("http://Service/", "getSubjectsAbove5Ects");
    private final static QName _GetAllStudentSubjectsByNameResponse_QNAME = new QName("http://Service/", "getAllStudentSubjectsByNameResponse");
    private final static QName _GetSubjectNamesResponse_QNAME = new QName("http://Service/", "getSubjectNamesResponse");
    private final static QName _AddSubjectResponse_QNAME = new QName("http://Service/", "addSubjectResponse");
    private final static QName _GetSubjectsAbove5EctsResponse_QNAME = new QName("http://Service/", "getSubjectsAbove5EctsResponse");
    private final static QName _CountStudentSubjects_QNAME = new QName("http://Service/", "countStudentSubjects");
    private final static QName _EncodeStudentAttachmentResponse_QNAME = new QName("http://Service/", "encodeStudentAttachmentResponse");
    private final static QName _ClearSubjectsResponse_QNAME = new QName("http://Service/", "clearSubjectsResponse");
    private final static QName _CountStudentSubjectsResponse_QNAME = new QName("http://Service/", "countStudentSubjectsResponse");
    private final static QName _GetSubjectNames_QNAME = new QName("http://Service/", "getSubjectNames");
    private final static QName _EncodeStudentAttachment_QNAME = new QName("http://Service/", "encodeStudentAttachment");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSubjectsAbove5EctsResponse }
     * 
     */
    public GetSubjectsAbove5EctsResponse createGetSubjectsAbove5EctsResponse() {
        return new GetSubjectsAbove5EctsResponse();
    }

    /**
     * Create an instance of {@link GetAllStudentSubjectsByNameResponse }
     * 
     */
    public GetAllStudentSubjectsByNameResponse createGetAllStudentSubjectsByNameResponse() {
        return new GetAllStudentSubjectsByNameResponse();
    }

    /**
     * Create an instance of {@link GetSubjectNamesResponse }
     * 
     */
    public GetSubjectNamesResponse createGetSubjectNamesResponse() {
        return new GetSubjectNamesResponse();
    }

    /**
     * Create an instance of {@link AddSubjectResponse }
     * 
     */
    public AddSubjectResponse createAddSubjectResponse() {
        return new AddSubjectResponse();
    }

    /**
     * Create an instance of {@link GetAllStudentSubjectsByName }
     * 
     */
    public GetAllStudentSubjectsByName createGetAllStudentSubjectsByName() {
        return new GetAllStudentSubjectsByName();
    }

    /**
     * Create an instance of {@link ClearSubjects }
     * 
     */
    public ClearSubjects createClearSubjects() {
        return new ClearSubjects();
    }

    /**
     * Create an instance of {@link AddSubject }
     * 
     */
    public AddSubject createAddSubject() {
        return new AddSubject();
    }

    /**
     * Create an instance of {@link GetSubjectsAbove5Ects }
     * 
     */
    public GetSubjectsAbove5Ects createGetSubjectsAbove5Ects() {
        return new GetSubjectsAbove5Ects();
    }

    /**
     * Create an instance of {@link GetSubjectNames }
     * 
     */
    public GetSubjectNames createGetSubjectNames() {
        return new GetSubjectNames();
    }

    /**
     * Create an instance of {@link EncodeStudentAttachment }
     * 
     */
    public EncodeStudentAttachment createEncodeStudentAttachment() {
        return new EncodeStudentAttachment();
    }

    /**
     * Create an instance of {@link CountStudentSubjects }
     * 
     */
    public CountStudentSubjects createCountStudentSubjects() {
        return new CountStudentSubjects();
    }

    /**
     * Create an instance of {@link ClearSubjectsResponse }
     * 
     */
    public ClearSubjectsResponse createClearSubjectsResponse() {
        return new ClearSubjectsResponse();
    }

    /**
     * Create an instance of {@link EncodeStudentAttachmentResponse }
     * 
     */
    public EncodeStudentAttachmentResponse createEncodeStudentAttachmentResponse() {
        return new EncodeStudentAttachmentResponse();
    }

    /**
     * Create an instance of {@link CountStudentSubjectsResponse }
     * 
     */
    public CountStudentSubjectsResponse createCountStudentSubjectsResponse() {
        return new CountStudentSubjectsResponse();
    }

    /**
     * Create an instance of {@link GetSubjectsAbove5EctsResponse.SubjectsAbove5Ects }
     * 
     */
    public GetSubjectsAbove5EctsResponse.SubjectsAbove5Ects createGetSubjectsAbove5EctsResponseSubjectsAbove5Ects() {
        return new GetSubjectsAbove5EctsResponse.SubjectsAbove5Ects();
    }

    /**
     * Create an instance of {@link GetAllStudentSubjectsByNameResponse.SubjectsByName }
     * 
     */
    public GetAllStudentSubjectsByNameResponse.SubjectsByName createGetAllStudentSubjectsByNameResponseSubjectsByName() {
        return new GetAllStudentSubjectsByNameResponse.SubjectsByName();
    }

    /**
     * Create an instance of {@link GetSubjectNamesResponse.Subjects }
     * 
     */
    public GetSubjectNamesResponse.Subjects createGetSubjectNamesResponseSubjects() {
        return new GetSubjectNamesResponse.Subjects();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllStudentSubjectsByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "getAllStudentSubjectsByName")
    public JAXBElement<GetAllStudentSubjectsByName> createGetAllStudentSubjectsByName(GetAllStudentSubjectsByName value) {
        return new JAXBElement<GetAllStudentSubjectsByName>(_GetAllStudentSubjectsByName_QNAME, GetAllStudentSubjectsByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClearSubjects }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "clearSubjects")
    public JAXBElement<ClearSubjects> createClearSubjects(ClearSubjects value) {
        return new JAXBElement<ClearSubjects>(_ClearSubjects_QNAME, ClearSubjects.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSubject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "addSubject")
    public JAXBElement<AddSubject> createAddSubject(AddSubject value) {
        return new JAXBElement<AddSubject>(_AddSubject_QNAME, AddSubject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubjectsAbove5Ects }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "getSubjectsAbove5Ects")
    public JAXBElement<GetSubjectsAbove5Ects> createGetSubjectsAbove5Ects(GetSubjectsAbove5Ects value) {
        return new JAXBElement<GetSubjectsAbove5Ects>(_GetSubjectsAbove5Ects_QNAME, GetSubjectsAbove5Ects.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllStudentSubjectsByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "getAllStudentSubjectsByNameResponse")
    public JAXBElement<GetAllStudentSubjectsByNameResponse> createGetAllStudentSubjectsByNameResponse(GetAllStudentSubjectsByNameResponse value) {
        return new JAXBElement<GetAllStudentSubjectsByNameResponse>(_GetAllStudentSubjectsByNameResponse_QNAME, GetAllStudentSubjectsByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubjectNamesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "getSubjectNamesResponse")
    public JAXBElement<GetSubjectNamesResponse> createGetSubjectNamesResponse(GetSubjectNamesResponse value) {
        return new JAXBElement<GetSubjectNamesResponse>(_GetSubjectNamesResponse_QNAME, GetSubjectNamesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSubjectResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "addSubjectResponse")
    public JAXBElement<AddSubjectResponse> createAddSubjectResponse(AddSubjectResponse value) {
        return new JAXBElement<AddSubjectResponse>(_AddSubjectResponse_QNAME, AddSubjectResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubjectsAbove5EctsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "getSubjectsAbove5EctsResponse")
    public JAXBElement<GetSubjectsAbove5EctsResponse> createGetSubjectsAbove5EctsResponse(GetSubjectsAbove5EctsResponse value) {
        return new JAXBElement<GetSubjectsAbove5EctsResponse>(_GetSubjectsAbove5EctsResponse_QNAME, GetSubjectsAbove5EctsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountStudentSubjects }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "countStudentSubjects")
    public JAXBElement<CountStudentSubjects> createCountStudentSubjects(CountStudentSubjects value) {
        return new JAXBElement<CountStudentSubjects>(_CountStudentSubjects_QNAME, CountStudentSubjects.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncodeStudentAttachmentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "encodeStudentAttachmentResponse")
    public JAXBElement<EncodeStudentAttachmentResponse> createEncodeStudentAttachmentResponse(EncodeStudentAttachmentResponse value) {
        return new JAXBElement<EncodeStudentAttachmentResponse>(_EncodeStudentAttachmentResponse_QNAME, EncodeStudentAttachmentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClearSubjectsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "clearSubjectsResponse")
    public JAXBElement<ClearSubjectsResponse> createClearSubjectsResponse(ClearSubjectsResponse value) {
        return new JAXBElement<ClearSubjectsResponse>(_ClearSubjectsResponse_QNAME, ClearSubjectsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountStudentSubjectsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "countStudentSubjectsResponse")
    public JAXBElement<CountStudentSubjectsResponse> createCountStudentSubjectsResponse(CountStudentSubjectsResponse value) {
        return new JAXBElement<CountStudentSubjectsResponse>(_CountStudentSubjectsResponse_QNAME, CountStudentSubjectsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubjectNames }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "getSubjectNames")
    public JAXBElement<GetSubjectNames> createGetSubjectNames(GetSubjectNames value) {
        return new JAXBElement<GetSubjectNames>(_GetSubjectNames_QNAME, GetSubjectNames.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncodeStudentAttachment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "encodeStudentAttachment")
    public JAXBElement<EncodeStudentAttachment> createEncodeStudentAttachment(EncodeStudentAttachment value) {
        return new JAXBElement<EncodeStudentAttachment>(_EncodeStudentAttachment_QNAME, EncodeStudentAttachment.class, null, value);
    }

}
