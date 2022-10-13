package com.spring.schoolmngtbackend.mapper;

import com.spring.schoolmngtbackend.bean.Instructor;
import com.spring.schoolmngtbackend.bean.Roles;
import com.spring.schoolmngtbackend.bean.TimeTable;
import com.spring.schoolmngtbackend.dto.InstructorDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class InstructorMapper implements EntityMapper<Instructor, InstructorDto> {
    @Autowired
    private TimeTableMapper timeTableMapper;
    @Override
    public Instructor toEntity(InstructorDto dto) {
        Instructor instructor = new Instructor();
        instructor.setFullName(dto.getFullName());
        instructor.setUsername(dto.getUsername());
        instructor.setEmail(dto.getEmail());
        instructor.setPassword(dto.getPassword());
        instructor.setBirthday(LocalDate.of(2021,12,12));
        instructor.setRoles(Roles.INSTRUCTOR);
        List<TimeTable> timeTableList = timeTableMapper.toEntity(dto.getTimeTablesDtos());
        instructor.setTimeTables(timeTableList);
        return instructor;
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
