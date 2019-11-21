package se331.lab.rest.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
//@Builder
@NoArgsConstructor
@AllArgsConstructor
//public class Lecturer {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    Long id;
//    String name;
//    String surname;
@SuperBuilder
public class Lecturer extends Person{
    @OneToMany(mappedBy = "advisor")
    @Builder.Default
    @ToString.Exclude
    List<Student> advisees = new ArrayList<>();
    @OneToMany(mappedBy = "lecturer")
    @Builder.Default
    @JsonManagedReference
    @ToString.Exclude
    List<Course> courses = new ArrayList<>();
}
