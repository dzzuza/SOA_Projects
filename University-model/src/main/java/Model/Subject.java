package Model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Subject implements Comparable<Subject> {
    String name;
    Integer ects;

    public Subject(String name, Integer ects){
        this.name=name;
        this.ects=ects;
    }

    public String getName() {
        return name;
    }

    public Integer getEcts() {
        return ects;
    }


    @Override
    public int compareTo(Subject o) {
        return name.compareTo(o.name);
    }
}
