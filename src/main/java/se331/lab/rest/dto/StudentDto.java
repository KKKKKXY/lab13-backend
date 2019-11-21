package se331.lab.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
    Long id;
    String studentId;
    String name;
    String surname;
    Double gpa;
    String image;
}
