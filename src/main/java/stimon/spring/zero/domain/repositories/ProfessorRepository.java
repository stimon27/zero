package stimon.spring.zero.domain.repositories;

import org.springframework.data.repository.CrudRepository;
import stimon.spring.zero.domain.Professor;

public interface ProfessorRepository extends CrudRepository<Professor, Long> {
}
