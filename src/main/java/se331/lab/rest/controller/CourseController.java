package se331.lab.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import se331.lab.rest.mapper.MapperUtil;
import se331.lab.rest.service.CourseService;
import se331.lab.rest.service.LecturerService;

@Controller
public class CourseController {
    @Autowired
    CourseService courseService;
    @GetMapping("/courses")
    public ResponseEntity getAllLecturer() {
        return ResponseEntity.ok(MapperUtil.INSTANCE.getCourseDto(courseService.getAllCourses()));
    }
}
