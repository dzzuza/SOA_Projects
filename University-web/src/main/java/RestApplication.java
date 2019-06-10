import Model.*;

import javax.ejb.EJB;
import javax.persistence.criteria.CriteriaBuilder;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

@Transactional
@Path("/service")
public class RestApplication {

    UniversityService service = new UniversityService();

    @EJB
    private UniversityDao universityDao;

/*    @POST
    @Path("/postprof")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    public Response makeProfesor(Profesor profesor) {
        universityDao.create(universityDao.DTOToEntity(profesor));
        return Response.status(Response.Status.CREATED.getStatusCode()).build();
    }*/

    @POST
    @Path("/postjpa")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    public Response makeStudent(Student student) {
        universityDao.create(universityDao.DTOToEntity(student));
        return Response.status(Response.Status.CREATED.getStatusCode()).build();
    }


    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStudent(@PathParam("id") Integer id) {
        StudentJPA student = universityDao.get(id);
        if (student == null) return Response.status(Response.Status.BAD_REQUEST).entity("Student with provided id doesn't exist.").build();
        return Response.ok(universityDao.EntityToDTO(student)).build();
    }

    @GET
    @Path("/getJpa")
    @Produces({"application/json"})
    public Response getStudents() {
        List<StudentJPA> studentJPAS = universityDao.list(0,10);
        if (studentJPAS == null) return Response.status(Response.Status.BAD_REQUEST).entity("There are no students in DB.").build();
        List<Student> students = universityDao.EntityToDTO(studentJPAS);
        return Response.ok(students).build();
    }

/*
    @GET
    @Path("/filter")
    @Produces(MediaType.APPLICATION_JSON)
*/


    @GET
    @Path("/filter")
    @Produces(MediaType.APPLICATION_JSON)
    public Response filter(@QueryParam("name") String name) {
        List<StudentJPA> studentsByName,allStudents;
        allStudents = universityDao.list(0,100);
        studentsByName = (name == null) ? allStudents : universityDao.filterByName(name);
        allStudents.retainAll(studentsByName);
        List<Student> students = universityDao.EntityToDTO(studentsByName);
        if (studentsByName.size() != 0) return Response.ok(students).build();
        return Response.status(Response.Status.BAD_REQUEST).entity("Student with provided name doesn't exist.").build();
    }

    @GET
    @Path("/bysubject")
    @Produces(MediaType.APPLICATION_JSON)
    public Response filterBySub(@QueryParam("subj") Integer subj) {
        List<StudentJPA> studentsBySub,allStudents;
        allStudents = universityDao.list(0,100);
        studentsBySub = (subj == null) ? allStudents : universityDao.filterBySubject(subj);
        allStudents.retainAll(studentsBySub);
        List<Student> students = universityDao.EntityToDTO(studentsBySub);
        if (studentsBySub.size() != 0) return Response.ok(students).build();
        return Response.status(Response.Status.BAD_REQUEST).entity("Student with provided name doesn't exist.").build();
    }

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
