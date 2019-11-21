package se331.lab.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import se331.lab.rest.dao.LecturerDao;
import se331.lab.rest.entity.Lecturer;

import java.util.List;

public interface LecturerService {
    List<Lecturer> getAllLecturers();
}
