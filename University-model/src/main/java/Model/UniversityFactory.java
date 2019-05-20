package Model;

import java.util.ArrayList;
import java.util.List;

public class UniversityFactory {

    public static void main(String[] args) {
        UniversityProtos.Student studentAlfa = UniversityFactory.createStudent();
        UniversityFactory.displayProto(studentAlfa);
    }
    public static UniversityProtos.Student createStudent(){

        /*UniversityProtos.Student student2 = UniversityProtos.Student.newBuilder()
                .setName("Tomek").setId(22).build();
        */
        UniversityProtos.Subject sub1 = UniversityProtos.Subject.newBuilder()
                .setName("Matematyka").setEcts(7).build();
        UniversityProtos.Subject sub2 = UniversityProtos.Subject.newBuilder()
                .setName("Socjologia").setEcts(5).build();
        List<UniversityProtos.Subject> subjects = new ArrayList<>();
        subjects.add(sub1);
        subjects.add(sub2);

        UniversityProtos.Student student = UniversityProtos.Student.newBuilder()
                .setName("Ala").setId(11).addSubject(sub1).addSubject(sub2).build();

        return student;
    }

    public static void displayProto(UniversityProtos.Student student){
        System.out.println("Student name is "+student.getName()+"."
        + "Students ID: "+student.getId()+"."
        + "Student is attending to "+student.getSubjectList().get(0).getName()+" which has "+student.getSubjectList().get(0).getEcts()+"."
        + "and to"+ student.getSubjectList().get(1).getName()+" which has "+student.getSubjectList().get(1).getEcts()+".");
    }
}

