package Model;

import java.util.ArrayList;
import java.util.List;

public class UniversityService {

    List<Student> list = new ArrayList<>();
    public List<Student> getAllStudents(){
        Student ola = new Student("Ola",111);
        Student tomek = new Student("Tomek",222);
        list.add(ola);
        list.add(tomek);
        return list;
    }

    public Student getStudentById(String id){
        return list.stream().filter(e->e.id.equals(id)).findFirst().get();
    }
}
