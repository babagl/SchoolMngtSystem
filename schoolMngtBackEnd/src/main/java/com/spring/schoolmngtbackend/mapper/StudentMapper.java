package com.spring.schoolmngtbackend.mapper;

import com.spring.schoolmngtbackend.bean.Students;
import com.spring.schoolmngtbackend.dto.StudentDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentMapper implements EntityMapper<Students, StudentDto> {
    @Override
    public Students toEntity(StudentDto dto) {
        return null;
    }

    @Override
    public StudentDto toDto(Students entity) {
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
