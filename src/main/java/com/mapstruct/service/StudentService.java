package com.mapstruct.service;

import com.mapstruct.dto.request.ResultMessage;
import com.mapstruct.dto.request.StudentRequest;

public interface StudentService {
    public ResultMessage insertData(StudentRequest request);
}
