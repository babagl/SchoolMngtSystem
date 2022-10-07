package com.spring.schoolmngtbackend.dto;

import com.spring.schoolmngtbackend.bean.TimeTable;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentDto {

    private Long idStudent;

    private String fullName;

    private String userName;

    private String password;

    private String Email;

    private String BirthDay;

    private String address;

    private String DateOfRegister;

    private TimeTable timeTable;
}
