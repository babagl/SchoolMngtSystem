package com.spring.schoolmngtbackend.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class StaffDto {
    private long idStaff;

    private String fullName;

    private String username;

    private String Email;

    private String password;

    private String birthday;

    private String address;
}
