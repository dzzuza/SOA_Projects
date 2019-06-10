import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(SubjectJPA.class)
public class SubjectJPA_ {
    public static volatile SingularAttribute<SubjectJPA, Integer> subjectid;
    public static volatile SingularAttribute<SubjectJPA, String> name;
    public static volatile SingularAttribute<SubjectJPA, Integer> ects;
    public static volatile ListAttribute<SubjectJPA, StudentJPA> students;

}
