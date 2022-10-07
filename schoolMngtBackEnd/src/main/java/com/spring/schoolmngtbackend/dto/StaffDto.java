package com.spring.schoolmngtbackend.dto;


import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class StaffDto {
    private long idStaff;

    private String fullName;

    private String userName;

    private String Email;

    private String password;

    private String Birthday;

    private String address;
}
