package se331.lab.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se331.lab.rest.dao.CourseDao;
import se331.lab.rest.entity.Course;

import java.util.List;
@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    CourseDao courseDao;
    @Override
    public List<Course> getAllCourses() {
        return courseDao.getAllCourses();
    }
}
