package Service;
import java.util.ArrayList;
import java.util.List;

public class Student {
    String name="Ania";
    Integer id=1;
    String logo = "D:\\IntelIJProjects\\MavenProjects\\University\\resume.txt";
    private List<Subject> subjects = new ArrayList<>();

    public List<Subject> addDefaultSubjects(){
        subjects.add(new Subject("Analiza",7));
        subjects.add(new Subject("Algebra",5));
        subjects.add(new Subject("Dyskretna",3));
        return subjects;
    }

    public List<String> getSubjectNames(){
        List<String> names = new ArrayList<>();
        subjects.stream().forEach(e->names.add(e.name));
        return names;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }
}
