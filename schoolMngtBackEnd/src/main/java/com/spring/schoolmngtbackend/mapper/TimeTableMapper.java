package com.spring.schoolmngtbackend.mapper;

import com.spring.schoolmngtbackend.bean.Instructor;
import com.spring.schoolmngtbackend.bean.TimeTable;
import com.spring.schoolmngtbackend.dto.TimeTableDto;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Component
public class TimeTableMapper implements EntityMapper<TimeTable, TimeTableDto> {
    InstructorMapper instructorMapper = new InstructorMapper();

    @Override
    public TimeTable toEntity(TimeTableDto dto) {
        TimeTable timeTable = new TimeTable();
        timeTable.setMatiere(dto.getMatiere());
        timeTable.setStartTime(LocalTime.now());
        timeTable.setEndTime(timeTable.getStartTime().plusHours(2));
        List<Instructor> instructorList = instructorMapper.toEntity(dto.getInstructorsDtos());
        timeTable.setInstructors(instructorList);
        return timeTable;
    }

    @Override
    public TimeTableDto toDto(TimeTable entity) {
        return null;
    }

    @Override
    public List<TimeTable> toEntity(List<TimeTableDto> dtoList) {
        return null;
    }

    @Override
    public List<TimeTableDto> toDto(List<TimeTable> entityList) {
        return null;
    }
}
