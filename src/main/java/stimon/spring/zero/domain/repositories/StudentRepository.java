package stimon.spring.zero.domain.repositories;

import org.springframework.data.repository.CrudRepository;
import stimon.spring.zero.domain.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
