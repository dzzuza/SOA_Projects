import Model.Student;
import Model.UniversityService;

import  javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

public class RestCli {

    public static void main(String[] args){
        UniversityService university = new UniversityService();
        Client client = ClientBuilder.newClient();

        //logowanie
        Form form = new Form();
        form.param("login","zuzanna")
                .param("password","dziedzic");

        Entity<Form> entity = Entity.form(form);

        WebTarget target = client.target("http://localhost:8080/University-web/rest/users/login");
        Response response = target.request(APPLICATION_JSON)
                //.header("Authorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJsb2dpbiI6Inp1emFubmEiLCJwYXNzd29yZCI6ImR6aWVkemljIiwianRpIjoiODMzZDFjYjQtMzlhNy00MGJhLThmNDYtOTU2NGE5YjFiOTVkIiwiaWF0IjoxNTU3NjAzMDAxLCJleHAiOjE1NTc2MDY2MDF9.45T9WyNnZBAZ9Py2rQ4HUhmfAzPYnqemXxjcOQ7SuLk")
                .post(entity);

        if (response.getStatus() != 200 ) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + response.getStatus());
        }

        System.out.println("Server response : "+response.getStatus());
        String token = response.getHeaderString("Authorization").substring(7);
        System.out.println(token);
        response.close();

        //getAll
        WebTarget target1 = client.target("http://localhost:8080/University-web/rest/getAll");
        Response response1 = target1.request()
                .header("Authorization","Bearer "+token)
                .get();

        Student[] students = response1.readEntity(Student[].class);
        for(Student s: students){
            System.out.println("xxx: "+s.toString());
            university.getAllStudents().add(s);
        }

        response1.close();
    }
}