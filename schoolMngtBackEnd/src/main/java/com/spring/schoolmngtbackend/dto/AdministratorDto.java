package com.spring.schoolmngtbackend.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdministratorDto {
    private long idAdministrator;

    private String fullName;

    private String username;

    private String email;

    private String password;

    private String birthday;

    private String address;

    List<InstructorDto> instructorDtos;

    List<TimeTableDto> timeTableDtos;

    List<StudentDto> studentDtos;

    List<StaffDto> staffDtos;


}
