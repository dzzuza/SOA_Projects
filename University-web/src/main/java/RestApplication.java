import Model.Student;
import Model.Subject;
import Model.UniversityService;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

import static javax.ws.rs.core.Response.status;

@Path("/")
public class RestApplication {

    UniversityService service = new UniversityService();

    @GET
    @JWTTokenNeeded
    @Path("/student/{id}")
    @Produces({"application/json"})
    public Student studentById(@PathParam("id") Integer id) {
        if (!service.getAllStudents().isEmpty()) {
            return service.getStudent(id);
        } else {
            return null;
        }
    }

    @GET
    @JWTTokenNeeded
    @Path("getAll")
    @Produces({"application/json"})
    public List<Student> getAll() {
        if (!service.getAllStudents().isEmpty()) {
            return service.getAllStudents();
        } else {
            return null;
        }
    }

    @POST
    @Path("/createStudent")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    public Response addStudent(Student student){
        if(service.getAllStudents().contains(student)){
            return Response.status(Response.Status.CONFLICT).build();
        }
        service.addStudent(student);
        return Response.status(Response.Status.CREATED.getStatusCode()).build();
    }
/*
    @GET
    @Path("/subjects")

    public List<Student> getStudentsSubjects() {
        return service.getAllStudents();
    }*/


}
