package com.spring.schoolmngtbackend.mapper;

import com.spring.schoolmngtbackend.bean.TimeTable;
import com.spring.schoolmngtbackend.dto.TimeTableDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TimeTableMapper implements EntityMapper<TimeTable, TimeTableDto> {
    @Override
    public TimeTable toEntity(TimeTableDto dto) {
        return null;
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
