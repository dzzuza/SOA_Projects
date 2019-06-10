import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(StudentJPA.class)
public class StudentJPA_ {
    public static volatile SingularAttribute<StudentJPA, Integer> studentid;
    public static volatile SingularAttribute<StudentJPA, String> name;
    public static volatile SingularAttribute<StudentJPA, String> logo;
    public static volatile ListAttribute<StudentJPA, SubjectJPA> subjects;

}
