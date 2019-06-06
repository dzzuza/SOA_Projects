import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

    public void setStudents(List<StudentJPA> students) {
        this.students = students;
    }

    public List<StudentJPA> getStudents() {
        return students;
    }

    @ManyToMany(mappedBy = "subjects")
    private List<StudentJPA> students = new ArrayList<StudentJPA>();

    @ManyToOne
    @JoinColumn(name = "profesor_id")
    private ProfesorJPA profesor;

    public SubjectJPA() {
    }

    public SubjectJPA(Integer subjectid, String name, Integer ects) {
        this.subjectid = subjectid;
        this.name = name;
        this.ects = ects;
    }


    public void setEcts(int ects) {
        this.ects = ects;
    }

    public int getId() {
        return subjectid;
    }

    public void setId(int id) {
        this.subjectid = id;
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