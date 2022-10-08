package com.spring.schoolmngtbackend.dto;


import lombok.AllArgsConstructor;
import lombok.Data;




import java.time.LocalDate;
import java.util.List;
@Data
@AllArgsConstructor
public class AdministratorDto {
    private long idAdministrator;

    private String fullName;

    private String userName;

    private String Email;

    private String password;

    private String Birthday;

    private String address;

    List<InstructorDto> instructorDtos;

    List<TimeTableDto> timeTableDtos;

    List<StudentDto> studentDtos;

    List<StaffDto> staffDtos;

    public AdministratorDto(String fullName, String userName, String email, String password, String birthday, String address, List<InstructorDto> instructorDtos, List<TimeTableDto> timeTableDtos, List<StudentDto> studentDtos, List<StaffDto> staffDtos) {
        this.fullName = fullName;
        this.userName = userName;
        Email = email;
        this.password = password;
        Birthday = birthday;
        this.address = address;
        this.instructorDtos = instructorDtos;
        this.timeTableDtos = timeTableDtos;
        this.studentDtos = studentDtos;
        this.staffDtos = staffDtos;
    }
}
