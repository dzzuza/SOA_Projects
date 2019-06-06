import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "subjectjpa")
public class SubjectJPA {

    @Id
    @GeneratedValue
    @Column(name = "subject_id")
    int subjectid;

    @Column(name = "subject_name")
    String name;

    @Column(name = "ects")
    int ects;

    public void setStudents(Set<StudentJPA> students) {
        this.students = students;
    }

    public Set<StudentJPA> getStudents() {
        return students;
    }

    @ManyToMany(mappedBy = "subjects")
    private Set<StudentJPA> students;

    @ManyToOne
    @JoinColumn(name = "profesor_id")
    private ProfesorJPA profesor;

    public SubjectJPA() {
    }

    public int getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(int subjectid) {
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


    public void setEcts(int ects) {
        this.ects = ects;
    }

    public int getEcts() {
        return ects;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}