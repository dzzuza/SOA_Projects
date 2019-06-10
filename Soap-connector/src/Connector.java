import service.GetAllStudentSubjectsByNameResponse;
import service.UniversityService;
import service.UniversityServiceBeanService;
import sun.misc.BASE64Decoder;

import javax.xml.ws.BindingProvider;
import java.io.*;

public class Connector {
    private static void setCred(UniversityService service){
        BindingProvider provider = (BindingProvider) service;
        provider.getRequestContext().put(BindingProvider.USERNAME_PROPERTY,"zuzanna");
        provider.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY,"dziedzic");
    }
    public static void main(String[] args) {
        UniversityServiceBeanService service = new UniversityServiceBeanService();
        UniversityService serviceStub = service.getUniversityServicePort();
        setCred(serviceStub);
        serviceStub.clearSubjects();
        serviceStub.addSubject("Analiza", 7);
        serviceStub.addSubject("Zarządzanie", 3);
        serviceStub.addSubject("Fizyka", 5);
        serviceStub.addSubject("Lingwistyka", 4);

        Integer subjectsNUmber = serviceStub.countStudentSubjects();
        System.out.println(subjectsNUmber);
        GetAllStudentSubjectsByNameResponse.SubjectsByName mySubjects = serviceStub.getAllStudentSubjectsByName();
        System.out.println("Posortowana alfabetycznie lista przedmiotow:");
        mySubjects.getSubjectName().stream().forEach(e-> System.out.println(e));

        System.out.println("\n (Metoda wymagająca autoryzacji)Przedmioty powyżej 5ects: ");
        serviceStub.getSubjectsAbove5Ects().getSubjectAbove5Ects().stream().forEach(e-> System.out.println(e));

        System.out.println("LOGO: ");
        String subjectLogoUp = serviceStub.encodeStudentAttachment();

        try {
            FileOutputStream stream = new FileOutputStream("D:\\IntelIJProjects\\MavenProjects\\University\\decodedResume.txt");
            BASE64Decoder decoder = new BASE64Decoder();
            byte[] subjectLogoDown = decoder.decodeBuffer(subjectLogoUp);
            System.out.println("LOGO: "+subjectLogoDown);
            stream.write(subjectLogoDown);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
