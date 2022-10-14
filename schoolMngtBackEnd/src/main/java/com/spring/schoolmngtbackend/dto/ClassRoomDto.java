package com.spring.schoolmngtbackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassRoomDto {
    private Long matriculeClassroom;
    private String className;
    private List<StudentDto>studentDtos;
}
