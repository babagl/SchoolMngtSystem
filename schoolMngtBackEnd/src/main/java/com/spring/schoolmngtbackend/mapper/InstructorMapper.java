package com.spring.schoolmngtbackend.mapper;

import com.spring.schoolmngtbackend.bean.Instructor;
import com.spring.schoolmngtbackend.dto.InstructorDto;

import java.util.List;

public class InstructorMapper implements EntityMapper<Instructor, InstructorDto> {
    @Override
    public Instructor toEntity(InstructorDto dto) {
        return null;
    }

    @Override
    public InstructorDto toDto(Instructor entity) {
        return null;
    }

    @Override
    public List<Instructor> toEntity(List<InstructorDto> dtoList) {
        return null;
    }

    @Override
    public List<InstructorDto> toDto(List<Instructor> entityList) {
        return null;
    }
}
