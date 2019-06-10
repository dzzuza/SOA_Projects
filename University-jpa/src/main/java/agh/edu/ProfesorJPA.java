package agh.edu;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "profesorjpa")
public class ProfesorJPA {

    @Id
    @GeneratedValue
    @Column(name = "profesor_id")
    private Integer profesorid;
    @Column(name = "profesor_name")
    private String name;

    public Integer getProfesorid() {
        return profesorid;
    }

    public void setProfesorid(Integer profesorid) {
        this.profesorid = profesorid;
    }

    @OneToMany(mappedBy = "profesor")
    private List<SubjectJPA> subjects= new ArrayList<SubjectJPA>();


    public void setName(String name) {
        this.name = name;
    }

    public void setSubjects(List<SubjectJPA> subjects) {
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public List<SubjectJPA> getSubjects() {
        return subjects;
    }

    public ProfesorJPA() {
    }
}