package agh.edu;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "subjectjpa")
public class SubjectJPA {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subject_id")
    Integer subjectid;

    @Column(name = "subject_name")
    String name;

    @Column(name = "ects")
    Integer ects;

    public void setStudents(List<StudentJPA> students) {
        this.students = students;
    }

    public List<StudentJPA> getStudents() {
        return students;
    }

    @ManyToMany(mappedBy = "subjects")
    private List<StudentJPA> students;

    @ManyToOne
    @JoinColumn(name = "profesor_id")
    private ProfesorJPA profesor;

    public SubjectJPA() {
    }

    public Integer getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(Integer subjectid) {
        this.subjectid = subjectid;
    }

    public ProfesorJPA getProfesor() {
        return profesor;
    }

    public void setProfesor(ProfesorJPA profesor) {
        this.profesor = profesor;
    }

    public SubjectJPA(Integer subjectid, String name, Integer ects) {
        this.subjectid = subjectid;
        this.name = name;
        this.ects = ects;
    }


    public void setEcts(Integer ects) {
        this.ects = ects;
    }

    public Integer getEcts() {
        return ects;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}