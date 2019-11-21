package se331.lab.rest.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
//@Builder
@NoArgsConstructor
@AllArgsConstructor
//public class Student {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    Long id;
@SuperBuilder
public class Student extends Person {

    String studentId;
    //    String name;
    //    String surname;
    Double gpa;
    String image;
    Integer penAmount;
    String description;
    @ManyToOne
    @ToString.Exclude
    Lecturer advisor;
    @ManyToMany(mappedBy = "students")
    @Builder.Default
    @ToString.Exclude
    List<Course> enrolledCourses = new ArrayList<>();


}
