package se331.lab.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import se331.lab.rest.mapper.MapperUtil;
import se331.lab.rest.service.CourseAnotherService;

@Controller
public class CourseAnotherController {
    @Autowired
    CourseAnotherService courseAnotherService;

    @GetMapping("course/amount/{numOfStudent}")
    public ResponseEntity<?> getCourseWithAmountOfStudent(@PathVariable Integer numOfStudent){
        return ResponseEntity.ok(MapperUtil.INSTANCE.getCourseDto(courseAnotherService.getCourseWhichStudentEnrolledMoreThan(numOfStudent)));
    }
}
