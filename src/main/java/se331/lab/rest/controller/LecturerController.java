package se331.lab.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import se331.lab.rest.mapper.MapperUtil;
import se331.lab.rest.service.LecturerService;
import se331.lab.rest.service.StudentService;

@Controller
public class LecturerController {
    @Autowired
    LecturerService lecturerService;

    @GetMapping("/lecturers")
    public ResponseEntity getAllLecturer() {
        return ResponseEntity.ok(MapperUtil.INSTANCE.getLecturerDto(lecturerService.getAllLecturers()));
    }
}
