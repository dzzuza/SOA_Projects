import Model.Student;
import Model.UniversityFactory;
import Model.UniversityProtos;
import Model.UniversityService;

import org.apache.commons.io.IOUtils;
import sun.misc.BASE64Decoder;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.io.*;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;


public class RestCli {

    public static void main(String[] args) throws IOException {
        UniversityService university = new UniversityService();
        Client client = ClientBuilder.newClient();
        //getAll
        WebTarget target1 = client.target("http://localhost:8080/University-web/rest/service/postjpa");
        WebTarget target2 = client.target("http://localhost:8080/University-web/rest/service/getJpa");
        /*StudentJPA student = new StudentJPA();
        student.setId(11);
        student.setName("Roman");*/
        Response response1 = target2.request().get();


        Student[] st = response1.readEntity(Student[].class);

        for (Student s : st) {
            System.out.println("xxx: " + s.toString());
            //university.getAllStudents().add(s);
        }

        response1.close();

        /*Student[] students = getStudents();
        for (Student s : students) {
            System.out.println(s.toString());
        }*/
    }
/*        private static Student[] getStudents () {
            Client client = ClientBuilder.newClient();
            WebTarget target = client.target("http://localhost:8080/University-web/rest/service/getAll");
            Response response = target.request().get();
            Student[] students = response.readEntity(Student[].class);
            //List<Student> students = response.readEntity(new GenericType<List<Student>>() {});
            response.close();
            return students;
        }*/

/*
        UniversityService university = new UniversityService();
        Client client = ClientBuilder.newClient();
        //logowanie
        Form form = new Form();
        form.param("login", "zuzanna")
                .param("password", "dziedzic");

        Entity<Form> entity = Entity.form(form);

        WebTarget target = client.target("http://localhost:8080/University-web/rest/users/login");
        Response response = target.request(APPLICATION_JSON)
                //.header("Authorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJsb2dpbiI6Inp1emFubmEiLCJwYXNzd29yZCI6ImR6aWVkemljIiwianRpIjoiODMzZDFjYjQtMzlhNy00MGJhLThmNDYtOTU2NGE5YjFiOTVkIiwiaWF0IjoxNTU3NjAzMDAxLCJleHAiOjE1NTc2MDY2MDF9.45T9WyNnZBAZ9Py2rQ4HUhmfAzPYnqemXxjcOQ7SuLk")
                .post(entity);

        if (response.getStatus() != 200) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + response.getStatus());
        }

        System.out.println("Server response : " + response.getStatus());
        String token = response.getHeaderString("Authorization").substring(7);
        System.out.println(token);
        response.close();

        //getAll
        WebTarget target1 = client.target("http://localhost:8080/University-web/rest/getAll");
        Response response1 = target1.request()
                .header("Authorization", "Bearer " + token)
                .get();

        Student[] students = response1.readEntity(Student[].class);
        for (Student s : students) {
            System.out.println("xxx: " + s.toString());
            university.getAllStudents().add(s);
        }

        response1.close();

        //  logo
        WebTarget target2 = client.target("http://localhost:8080/University-web/rest/encodeLogo");
        Response response2 = target1.request()
                .header("accepted", MediaType.APPLICATION_OCTET_STREAM)
                .get();

        //InputStream in = (InputStream)response2.getEntity();

        byte[] studentLogo = response2.readEntity(byte[].class);
        //System.out.println("LOGOIN: "+studentLogo);

        try {
            String s= new String(studentLogo, "UTF8");
            FileOutputStream stream = new FileOutputStream("D:\\IntelIJProjects\\MavenProjects\\University\\decoded.txt");
            BASE64Decoder decoder = new BASE64Decoder();
            byte[] studentLogoDown = decoder.decodeBuffer(new String(studentLogo));
            System.out.println("LOGOOUT: "+studentLogoDown);
            stream.write(studentLogoDown);
        } catch (IOException e) {
            e.printStackTrace();
        }
        response2.close();

        WebTarget target3 = client.target("http://localhost:8080/University-web/rest/proto");
        InputStream studentBytes = target3.request().header("accepted", MediaType.APPLICATION_OCTET_STREAM)
                .get(InputStream.class);
*/
/*        Response response3 = target3.request()
                .header("accepted", MediaType.APPLICATION_OCTET_STREAM)
                .get();*//*

        UniversityProtos.Student student = UniversityProtos.Student.parseFrom(IOUtils.toByteArray(studentBytes));
        //byte[] studentProto = response3.readEntity(byte[].class);
        System.out.println("ProtoBuf :\n"+ student);
        System.out.println("ProtoBufDisplay :\n");
        UniversityFactory.displayProto(student);
        //response3.close();
    }
*/

}
