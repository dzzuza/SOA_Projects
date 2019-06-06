import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "profesorjpa")
public class ProfesorJPA {

    @Id
    @GeneratedValue
    @Column(name = "profesor_id")
    private int profesorid;
    @Column(name = "profesor_name")
    private String name;

    @OneToMany(mappedBy = "profesor")
    private List<SubjectJPA> subjects= new ArrayList<SubjectJPA>();

    public void setId(int id) {
        profesorid = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubjects(List<SubjectJPA> subjects) {
        this.subjects = subjects;
    }

    public int getId() {
        return profesorid;
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