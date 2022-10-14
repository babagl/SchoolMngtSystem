package com.spring.schoolmngtbackend.dto;

import com.spring.schoolmngtbackend.bean.TimeTable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {

    private Long idStudent;

    private String fullName;

    private String username;

    private String password;

    private String email;

    private String birthDay;

    private String address;

    private String DateOfRegister;

    private TimeTableDto timeTableDto;
}
