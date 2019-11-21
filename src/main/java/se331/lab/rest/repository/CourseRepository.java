package se331.lab.rest.repository;

import org.springframework.data.repository.CrudRepository;
import se331.lab.rest.entity.Course;

import java.util.List;

public interface CourseRepository  extends CrudRepository<Course,Long> {
    List<Course> findAll();
}
