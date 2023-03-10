package stimon.spring.zero.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import stimon.spring.zero.domain.Student;
import stimon.spring.zero.domain.Course;
import stimon.spring.zero.domain.Professor;
import stimon.spring.zero.domain.repositories.StudentRepository;
import stimon.spring.zero.domain.repositories.CourseRepository;
import stimon.spring.zero.domain.repositories.ProfessorRepository;

@Component
public class BootStrapData implements CommandLineRunner {
    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;
    private final ProfessorRepository professorRepository;

    public BootStrapData(StudentRepository studentRepository, CourseRepository courseRepository, ProfessorRepository professorRepository) {
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
        this.professorRepository = professorRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Started in Bootstrap");

        Student student0 = new Student("Szymon", "Wilk");
        Course course0 = new Course("Spring guru", "123");
        student0.getCourses().add(course0);
        course0.getStudents().add(student0);
        studentRepository.save(student0);
        courseRepository.save(course0);
        Professor professor0 = new Professor("J", "T");
        professor0.getCourses().add(course0);
        professorRepository.save(professor0);
        course0.setProfessor(professor0);
        courseRepository.save(course0);

        System.out.println("Number of courses: " + courseRepository.count());
    }
}
