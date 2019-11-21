package se331.lab.rest.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import se331.lab.rest.dto.CourseDto;
import se331.lab.rest.dto.LecturerDto;
import se331.lab.rest.dto.StudentDto;
import se331.lab.rest.dto.UserDto;
import se331.lab.rest.entity.Course;
import se331.lab.rest.entity.Lecturer;
import se331.lab.rest.entity.Student;
import se331.lab.rest.security.entity.User;

import java.util.List;

@Mapper
public interface MapperUtil {
    MapperUtil INSTANCE = Mappers.getMapper( MapperUtil.class );

    @Mappings({})
    LecturerDto getLecturerDto(Lecturer lecturer);

    @Mappings({})
    List<LecturerDto> getLecturerDto(List<Lecturer> lecturer);

    @Mappings({})
    StudentDto getStudentDto(Student student);
    @Mappings({})
    List<StudentDto> getStudentDto(List<Student> students);
    @Mappings({})
    CourseDto getCourseDto(Course course);
    @Mappings({})
    List<CourseDto> getCourseDto(List<Course> courses);

//    @Mappings({})
//    UserDto getUserDto(Student student);
//    @Mappings({})
//    UserDto getUserDto(Lecturer lecturer);

    @Mappings({@Mapping(target = "authorities", source = "user.authorities")})
    UserDto getUserDto(Student student);
    @Mappings({@Mapping(target = "authorities", source = "user.authorities")})
    UserDto getUserDto(Lecturer lecturer);
}
