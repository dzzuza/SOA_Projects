package Model;

import org.codehaus.jackson.annotate.JsonTypeName;
import org.codehaus.jackson.map.annotate.JsonRootName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@JsonRootName("student")
//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "movie", propOrder = { "name","id"})
public class Student {
    String name;
    Integer id;
    public String logo = "D:\\IntelIJProjects\\MavenProjects\\University\\resume.txt";
    public Student(){}
    public Student(String name,Integer id){
        this.name=name;
        this.id=id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    private List<Subject> subjects = new ArrayList<>();

    public List<Subject> addDefaultSubjects(){
        subjects.add(new Subject("Analiza",7));
        subjects.add(new Subject("Algebra",5));
        subjects.add(new Subject("Dyskretna",3));
        return subjects;
    }

    public List<String> getSubjectNames(){
        List<String> names = new ArrayList<>();
        subjects.stream().forEach(e->names.add(e.name));
        return names;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }


    @Override
    public String toString() {
        return new StringBuffer("Student Name: ").append(this.name).append(" Id: ").append(this.id).toString();
    }
}
