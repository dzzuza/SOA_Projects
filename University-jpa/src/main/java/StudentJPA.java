import javax.persistence.*;
import javax.security.auth.Subject;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "studentjpa")
public class StudentJPA {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Integer studentid;

    @Column(name = "student_name")
    private String name;

    @Column(name = "logo")
    private String logo;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "student_subject", joinColumns = {
            @JoinColumn(name = "student_id")}, inverseJoinColumns = {@JoinColumn(name = "subject_id")})
    private List<SubjectJPA> subjects;


    public StudentJPA() {
    }

    public StudentJPA(Integer studentid, String name, String logo, List<SubjectJPA> subjects) {
        this.studentid = studentid;
        this.name = name;
        this.logo=logo;
        this.subjects=subjects;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return studentid;
    }

    public void setId(Integer studentid) {
        this.studentid = studentid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SubjectJPA> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<SubjectJPA> subjects) {
        this.subjects = subjects;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
/*    public List<SubjectJPA> addDefaultSubjects() {
        subjects.add(new SubjectJPA("Analiza", 7));
        subjects.add(new SubjectJPA("Algebra", 5));
        subjects.add(new SubjectJPA("Dyskretna", 3));
        return subjects;
    }*/

/*    public List<String> getSubjectNames() {
        List<String> names = new ArrayList<>();
        subjects.stream().forEach(e -> names.add(e.getName()));
        return names;
    }*/

    @Override
    public String toString() {
        return new StringBuffer("Student Name: ").append(this.name).append(" Id: ").append(this.studentid).toString();
    }
}
