package se331.lab.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import se331.lab.rest.dao.CourseAnotherDao;
import se331.lab.rest.entity.Course;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseAnotherServiceImpl implements CourseAnotherService{
    @Autowired
    CourseAnotherDao courseAnotherDao;
    @Override
    @Transactional
    public List<Course> getCourseWhichStudentEnrolledMoreThan(int amountOfStudent) {
        List<Course> courses = courseAnotherDao.findAll();
        return courses.stream().filter(course -> course.getStudents().size() > amountOfStudent).collect(Collectors.toList());
    }
}
