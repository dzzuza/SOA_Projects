import javax.ejb.Stateless;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import Model.Subject;
import org.hibernate.Criteria;
import Model.Profesor;
import Model.Student;
import org.modelmapper.ModelMapper;
@Transactional
@Stateless
public class UniversityDao extends AbstractDao {

    public List<StudentJPA> filterByName(String name){
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<StudentJPA> query = builder.createQuery(StudentJPA.class);
        Root<StudentJPA> root = query.from(StudentJPA.class);
        ParameterExpression<String> param = builder.parameter(String.class);
        query.select(root).where(builder.equal(root.get("name"),param));
        TypedQuery<StudentJPA> typedQuery = entityManager.createQuery(query);
        typedQuery.setParameter(param,name);
        return typedQuery.getResultList();
    }

    public List<StudentJPA> filterBySubject(Integer subjectId){
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<StudentJPA> query = builder.createQuery(StudentJPA.class);
        Root<StudentJPA> root = query.from(StudentJPA.class);

        Join<StudentJPA,SubjectJPA> join = root.join(StudentJPA_.subjects);
        query.where(builder.equal(join.get(SubjectJPA_.subjectid),subjectId));
        query.distinct(true);

        return entityManager.createQuery(query).getResultList();
    }

    private static final Logger LOGGER = Logger.getLogger("Soa" + UniversityDao.class.toString());

    public List<Student> EntityToDTO(List<StudentJPA> studentsJPA){
        ModelMapper modelMapper = new ModelMapper();
        return studentsJPA.stream().map(s -> modelMapper.map(s, Student.class)).collect(Collectors.toList());
    }

/*    public ProfesorJPA DTOToEntity(Profesor profesor){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(profesor, ProfesorJPA.class);
    }*/

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
