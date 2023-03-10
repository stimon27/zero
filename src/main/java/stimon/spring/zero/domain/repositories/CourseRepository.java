package stimon.spring.zero.domain.repositories;

import org.springframework.data.repository.CrudRepository;
import stimon.spring.zero.domain.Course;

public interface CourseRepository extends CrudRepository<Course, Long> {
}
