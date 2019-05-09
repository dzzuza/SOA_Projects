import Model.Student;
import Model.Subject;
import Model.UniversityService;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/uni")
public class RestApplication {

    UniversityService service = new UniversityService();

    @GET
    @Path("/echo")
    @Produces({"application/json"})
    public Response getEcho(@QueryParam("mess") String msg){
        return Response.ok("Your message: " + msg).build();
    }

    @GET
    @Path("/student")
    @Produces({"application/json"})
    public Student studentById(@QueryParam("id") String id) {
        return service.getStudentById(id);
    }

    /*@POST
    @Path("/createStudent")
    @Produces({"application/json"})
    public Response addSubject(@QueryParam("name") String name, @QueryParam("id") String id){

    }*/

    @GET
    @Path("/subjects")
    @Produces({"application/json"})
    public List<Student> getStudentsSubjects(){
        return service.getAllStudents();
    }



}
