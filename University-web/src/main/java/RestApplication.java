import Model.Student;
import Model.UniversityFactory;
import Model.UniversityProtos;
import Model.UniversityService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.List;

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
    @JWTTokenNeeded
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

    @GET
    @Path("/encodeLogo")
    @Produces({MediaType.APPLICATION_OCTET_STREAM})
    public Response encodeStudentAttachment(){
        //String studentLogo = service.getStudent(1).logo;
        //ClassLoader classLoader = new RestApplication().getClass().getClassLoader();
        //File file = new File( classLoader.getResource( "resume.txt" ).getFile());
        String studentLogo = "D:\\IntelIJProjects\\MavenProjects\\University\\resume.txt";
        //byte[] encodedFile= new byte[10];
        try (FileInputStream inputStreamReader = new FileInputStream(studentLogo)){
            byte[] bytes = new byte[(int)studentLogo.length()];
            inputStreamReader.read(bytes);
            byte[] encodedFile = Base64.getEncoder().encode(bytes);
                        return Response.ok(encodedFile)
                    .header("accepted",MediaType.APPLICATION_OCTET_STREAM).build();
        }
        catch (IOException e) {
            e.printStackTrace();
            return Response.status(Response.Status.NOT_FOUND).entity(e.getMessage()).build();
        }
//        return encodedFile;
    }

    @GET
    @Path("/proto")
    //@Consumes(MediaType.TEXT_HTML)
    @Produces(MediaType.APPLICATION_OCTET_STREAM)
    public Response getStudentPB(){
        //if(StringUtils.equalsIgnoreCase("Ala")){}
        UniversityProtos.Student studentAlfa = UniversityFactory.createStudent();
        return Response.ok(studentAlfa.toByteArray(),MediaType.APPLICATION_OCTET_STREAM).status(200).build();
    }
/*
    @GET
    @Path("/subjects")

    public List<Student> getStudentsSubjects() {
        return service.getAllStudents();
    }*/


}
