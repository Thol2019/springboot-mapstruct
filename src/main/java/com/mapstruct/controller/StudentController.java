package com.mapstruct.controller;

import com.mapstruct.dto.request.ResultMessage;
import com.mapstruct.dto.request.StudentRequest;
import com.mapstruct.dto.response.StudentResponse;
import com.mapstruct.service.StudentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @PostMapping("/insert")
    public ResponseEntity<ResultMessage> insert(@Valid @RequestBody StudentRequest request){
        return ResponseEntity.ok(studentService.insertData(request));
    }
}
