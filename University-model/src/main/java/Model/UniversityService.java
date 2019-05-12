package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniversityService {

    public static Map<Integer,Student> students = new HashMap<>();

    public UniversityService(){
        students.put(1,new Student("Natalia",1));
        students.put(2,new Student("Zbyszek",2));
    }

    public List<Student> getAllStudents(){
        return new ArrayList<>(students.values());
    }

    public Student addStudent(Student student){
        Integer id = students.size()+1;
        student.setId(id);
        students.put(id,student);
        return student;
    }

    public Student getStudent(Integer id){
        return students.get(id);
    }

    public Student update(Student student){
        if(!students.containsKey(student.getId())){
            return null;
        }else {
            students.put(student.getId(),student);
            return student;
        }
    }

    public Student removeStudent(Integer id){
        return students.remove(id);
    }
}
