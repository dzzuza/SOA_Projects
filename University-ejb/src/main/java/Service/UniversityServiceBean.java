package Service;

import Model.Student;
import Model.Subject;
import org.jboss.security.annotation.SecurityDomain;
import org.jboss.ws.api.annotation.WebContext;

import javax.annotation.security.*;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.List;

@Stateless(name = "UniversityServiceEJB")
@WebService(name = "UniversityService")
@SecurityDomain("uni")
@DeclareRoles({"group1"})
@WebContext(authMethod = "BASIC", transportGuarantee = "NONE")

public class UniversityServiceBean {

    Student student = new Student();

    public UniversityServiceBean() {
    }

    @XmlElementWrapper(name="subjects")
    @XmlElement(name="subject")
    @WebMethod
    @WebResult(name = "Subjects")
    @PermitAll
    public List<String> getSubjectNames(){
        return student.getSubjectNames();
    }

    @XmlElement(name="newSubject")
    @WebResult(name = "newSubjectadded")
    @PermitAll
    @WebMethod
    public void addSubject(@WebParam(name = "name") String name, @WebParam(name="ects") Integer ects){
        student.getSubjects().add(new Subject(name,ects));
    }

    @PermitAll
    @WebMethod
    public void clearSubjects(){
        student.getSubjects().clear();
    }

    @XmlElement(name="subjectsNumber")
    @WebResult(name = "subjectsCounted")
    @PermitAll
    @WebMethod
    public int countStudentSubjects(){
        return student.getSubjects().size();
    }


    @XmlElementWrapper(name="subjectsAbove5Ects")
    @XmlElement(name="subjectAbove5ects")
    @RolesAllowed("group1")
    @WebMethod
    public List<String> getSubjectsAbove5Ects(){
        List<String> subjectsAbove5ects = new ArrayList<>();
        student.getSubjects().stream().filter(e->e.getEcts()>5).forEach(e->subjectsAbove5ects.add(e.getName()));
        return subjectsAbove5ects;
    }

    @XmlElementWrapper(name="subjectsByName")
    @XmlElement(name="subjectName")
    @PermitAll
    @WebMethod
    public List<String> getAllStudentSubjectsByName(){
        Collections.sort(student.getSubjects());
        return student.getSubjectNames();
    }

    @XmlElement(name="binaryUploaded")
    @PermitAll
    @WebMethod
    public String encodeStudentAttachment(){
        String filePath = student.logo;
        String encodedfile = null;
        try {
            FileInputStream fileInputStreamReader = new FileInputStream(filePath);
            byte[] bytes = new byte[(int)filePath.length()];
            fileInputStreamReader.read(bytes);
            encodedfile = Base64.getEncoder().encodeToString(bytes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return encodedfile;
    }
}
