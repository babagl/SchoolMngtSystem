package com.spring.schoolmngtbackend.mapper;

import com.spring.schoolmngtbackend.bean.Roles;
import com.spring.schoolmngtbackend.bean.Students;
import com.spring.schoolmngtbackend.bean.TimeTable;
import com.spring.schoolmngtbackend.dto.StudentDto;
import com.spring.schoolmngtbackend.dto.TimeTableDto;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Component
public class StudentMapper implements EntityMapper<Students, StudentDto> {
    TimeTableMapper timeTableMapper = new TimeTableMapper();

    @Override
    public Students toEntity(StudentDto dto) {
        Students students = new Students();
        students.setFullName(dto.getFullName());
        students.setUsername(dto.getUsername());
        students.setEmail(dto.getEmail());
        students.setPassword(dto.getPassword());
        students.setBirthDay(LocalDate.parse(dto.getBirthDay()));
        students.setRoles(Roles.STUDENT);
        students.setDateOfRegister(LocalDateTime.now());
        TimeTable timeTable =  timeTableMapper.toEntity(dto.getTimeTableDto());
        students.setTimeTable(timeTable);
        return students;
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
