package com.mapstruct.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String userName;

    private String gender;

    private int age;

    private String classes;
}
