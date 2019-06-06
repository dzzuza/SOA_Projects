package Model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Subject implements Comparable<Subject> {
    int subjectid;
    String name;
    int ects;


    public Subject() {
    }

    public Subject(int subjectid, String name, int ects){
        this.subjectid=subjectid;
        this.name=name;
        this.ects=ects;
    }

    public String getName() {
        return name;
    }

    public Integer getEcts() {
        return ects;
    }

    public void setSubjectid(int subjectid) {
        this.subjectid = subjectid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEcts(Integer ects) {
        this.ects = ects;
    }

    public int getSubjectid() {
        return subjectid;
    }

    @Override
    public int compareTo(Subject o) {
        return name.compareTo(o.name);
    }
}
