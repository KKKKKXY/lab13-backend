package se331.lab.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se331.lab.rest.dao.LecturerDao;
import se331.lab.rest.entity.Lecturer;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class LecturerServiceImpl implements LecturerService {
    @Autowired
    LecturerDao lectureDao;
    @Override
    public List<Lecturer> getAllLecturers() {
        return lectureDao.getLecturers();
    }
}
