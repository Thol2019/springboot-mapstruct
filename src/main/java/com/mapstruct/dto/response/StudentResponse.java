package com.mapstruct.dto.response;

import jakarta.validation.constraints.NotBlank;

public class StudentResponse {

    private Long id;

    @NotBlank(message = "Username is not null.")
    private String userName;

    @NotBlank(message = "Gender is not null.")
    private String gender;

    @NotBlank(message = "Age is not null.")
    private int age;

    @NotBlank(message = "Classes is not null.")
    private String classes;
}
