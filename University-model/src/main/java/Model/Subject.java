package Model;

import org.codehaus.jackson.map.annotate.JsonRootName;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Subject implements Comparable<Subject> {
    private Integer subjectid;
    private String name;
    private Integer ects;
    private Profesor profesor;

    public Subject() {
    }

    /*public Subject(int subjectid, String name, int ects){
        this.subjectid=subjectid;
        this.name=name;
        this.ects=ects;
    }
*/
    public String getName() {
        return name;
    }

    public Integer getEcts() {
        return ects;
    }

    public void setSubjectid(Integer subjectid) {
        this.subjectid = subjectid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEcts(Integer ects) {
        this.ects = ects;
    }

    public Integer getSubjectid() {
        return subjectid;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    @Override
    public int compareTo(Subject o) {
        return name.compareTo(o.name);
    }
}
