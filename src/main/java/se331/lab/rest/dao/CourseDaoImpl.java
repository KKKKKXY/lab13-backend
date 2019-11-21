package se331.lab.rest.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import se331.lab.rest.entity.Course;
import se331.lab.rest.repository.CourseRepository;

import java.util.List;
@Repository
public class CourseDaoImpl implements CourseDao {
    @Autowired
    CourseRepository courseRepository;
    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }
}
