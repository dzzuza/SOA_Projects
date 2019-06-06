package Model;

import org.codehaus.jackson.map.annotate.JsonRootName;
import java.util.ArrayList;
import java.util.List;

@JsonRootName("student")
//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "movie", propOrder = { "name","id"})
public class Student {
    private int studentid;
    private String name;
    private String logo;

    //public String logo = "D:\\IntelIJProjects\\MavenProjects\\University\\resume.txt";
    private List<Subject> subjects=new ArrayList<>();

    public Student(){}

    public Student(int id,String name,String logo, List<Subject> subjects){
        this.studentid=id;
        this.name=name;
        this.logo=logo;
        this.subjects=subjects;
    }
    /*public List<Subject> addDefaultSubjects(){
        subjects.add(new Subject("Analiza",7));
        subjects.add(new Subject("Algebra",5));
        subjects.add(new Subject("Dyskretna",3));
        return subjects;
    }*/

    /*public List<String> getSubjectNames(){
        List<String> names = new ArrayList<>();
        subjects.stream().forEach(e->names.add(e.name));
        return names;
    }*/
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
    public String getName() {
        return name;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }


    @Override
    public String toString() {
        return new StringBuffer("Student Name: ").append(this.name).append(" Id: ").append(this.studentid).toString();
    }
}
