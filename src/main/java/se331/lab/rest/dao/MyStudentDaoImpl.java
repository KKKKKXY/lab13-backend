package se331.lab.rest.dao;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;
import se331.lab.rest.entity.Student;

import java.util.ArrayList;
import java.util.List;
@Profile("MyDao")
@Repository
@Slf4j
public class MyStudentDaoImpl implements StudentDao {
    List<Student> students;
    public MyStudentDaoImpl(){
        this.students = new ArrayList<>();
        this.students.add(Student.builder()
                .id(1l)
                .studentId("SE-001")
                .name("Prayuth")
                .surname("The minister")
                .gpa(3.59)
                .image("https://firebasestorage.googleapis.com/v0/b/test-331-lab05.appspot.com/o/tu.jpg?alt=media&token=f16b5c1c-fbea-4d98-9fa3-732b69a1bae8")
                .penAmount(15)
                .description("The great man ever!!!!")
                .build());
        this.students.add(Student.builder()
                .id(2l)
                .studentId("SE-002")
                .name("Cherprang ")
                .surname("BNK48")
                .gpa(4.01)
                .image("https://firebasestorage.googleapis.com/v0/b/test-331-lab05.appspot.com/o/cherprang.png?alt=media&token=2e6a41f3-3bf0-4e42-ac6f-8b7516e24d92")
                .penAmount(2)
                .description("Code for Thailand")
                .build());
        this.students.add(Student.builder()
                .id(3l)
                .studentId("SE-003")
                .name("Nobi")
                .surname("Nobita")
                .gpa(1.77)
                .image("https://firebasestorage.googleapis.com/v0/b/test-331-lab05.appspot.com/o/nobita.jpg?alt=media&token=16e30fb0-9904-470f-b868-c35601df8326")
                .penAmount(0)
                .description("Welcome to Olympic")
                .build());

    }
    @Override
    public List<Student> getAllStudent() {
        log.info("LabDao is called");
        return students;
    }

    @Override
    public Student findById(Long studentId) {
        return students.get((int) (studentId -1));
    }

    @Override
    public Student saveStudent(Student student) {
        student.setId((long) students.size());
        students.add(student);
        return student;
    }
}
