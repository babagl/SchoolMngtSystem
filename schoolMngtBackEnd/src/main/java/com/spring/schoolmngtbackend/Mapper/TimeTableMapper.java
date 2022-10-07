package com.spring.schoolmngtbackend.Mapper;

import com.spring.schoolmngtbackend.bean.TimeTable;
import com.spring.schoolmngtbackend.dto.TimeTableDto;

import java.util.List;

public class TimeTableMapper implements EntityMapper<TimeTable, TimeTableDto> {
    @Override
    public TimeTable toEntity(TimeTableDto dto) {
        return null;
    }

    @Override
    public TimeTableDto ToDto(TimeTable entity) {
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
