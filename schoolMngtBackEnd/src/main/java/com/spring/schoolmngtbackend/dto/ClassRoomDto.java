package com.spring.schoolmngtbackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;


import java.util.List;
@Data
@AllArgsConstructor
public class ClassRoomDto {
    private long matriculeClass;
    private String className;
    private List<StudentDto>studentDtos;
}
