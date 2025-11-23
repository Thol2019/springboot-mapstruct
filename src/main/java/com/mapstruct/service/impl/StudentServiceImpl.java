package com.mapstruct.service.impl;

import com.mapstruct.dto.request.ResultMessage;
import com.mapstruct.dto.request.StudentRequest;
import com.mapstruct.dto.response.StudentResponse;
import com.mapstruct.entity.Student;
import com.mapstruct.enums.EnumStatus;
import com.mapstruct.mapper.StudentMapper;
import com.mapstruct.repository.StudentRepository;
import com.mapstruct.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    @Override
    public ResultMessage insertData(StudentRequest request) {
        ResultMessage resultMessage = new ResultMessage();
        try{
            Student student = studentMapper.toStudent(request);
            student = studentRepository.save(student);
            StudentResponse studentResponse = studentMapper.fromStudent(student);
            resultMessage.setStatus(EnumStatus.SUCCESS.status());
            resultMessage.setMessage("Insert data is successful.");
            resultMessage.setData(studentResponse);
            return resultMessage;

        }catch (Exception e){
            return null;
        }
    }
}
