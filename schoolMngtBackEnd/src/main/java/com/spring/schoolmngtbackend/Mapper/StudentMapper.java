package com.spring.schoolmngtbackend.Mapper;

import com.spring.schoolmngtbackend.bean.Students;
import com.spring.schoolmngtbackend.dto.StudentDto;

import java.util.List;

public class StudentMapper implements EntityMapper<Students, StudentDto> {
    @Override
    public Students toEntity(StudentDto dto) {
        return null;
    }

    @Override
    public StudentDto ToDto(Students entity) {
        return null;
    }

    @Override
    public List<Students> toEntity(List<StudentDto> dtoList) {
        return null;
    }

    @Override
    public List<StudentDto> toDto(List<Students> entityList) {
        return null;
    }
}
