import javax.ejb.Stateless;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import Model.Student;
import org.modelmapper.ModelMapper;

@Stateless
public class UniversityDao extends AbstractDao {

    private static final Logger LOGGER = Logger.getLogger("Soa" + UniversityDao.class.toString());

    public List<Student> EntityToDTO(List<StudentJPA> studentsJPA){
        ModelMapper modelMapper = new ModelMapper();
        return studentsJPA.stream().map(s -> modelMapper.map(s, Student.class)).collect(Collectors.toList());
    }
    public StudentJPA DTOToEntity(Student student){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(student, StudentJPA.class);
    }
    public Student EntityToDTO(StudentJPA studentJPA){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(studentJPA, Student.class);
    }
    @Override
    protected Logger getLogger() {
        return LOGGER;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected Class<StudentJPA> getType() {
        return StudentJPA.class;
    }
}
