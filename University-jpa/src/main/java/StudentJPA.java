import javax.persistence.*;
import javax.security.auth.Subject;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "studentjpa")
public class StudentJPA {

    @Id
    @GeneratedValue
    @Column(name = "student_id")
    private int studentid;

    @Column(name = "student_name")
    private String name;

    @Column(name = "logo")
    private String logo;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "student_subject", joinColumns = {
            @JoinColumn(name = "student_id")}, inverseJoinColumns = {@JoinColumn(name = "subject_id")})
    private List<SubjectJPA> subjects=new ArrayList<SubjectJPA>();


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

    public int getId() {
        return studentid;
    }

    public void setId(int studentid) {
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
