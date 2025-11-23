package com.mapstruct.mapper;

import com.mapstruct.dto.request.StudentRequest;
import com.mapstruct.dto.response.StudentResponse;
import com.mapstruct.entity.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    Student toStudent(StudentRequest dto);

    StudentResponse fromStudent(Student student);
}
