package com.spring.schoolmngtbackend.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
public class InstructorDto {
    private long idInstructor;

    private String fullName;

    private String userName;

    private String Email;

    private String password;

    private String Birthday;

    private String address;

    List<TimeTableDto> timeTablesDtos;
}
