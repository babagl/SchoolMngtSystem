package com.spring.schoolmngtbackend.Mapper;

import com.spring.schoolmngtbackend.bean.Staff;
import com.spring.schoolmngtbackend.dto.StaffDto;

import java.util.List;

public class StaffMapper implements EntityMapper<Staff, StaffDto> {
    @Override
    public Staff toEntity(StaffDto dto) {
        return null;
    }

    @Override
    public StaffDto ToDto(Staff entity) {
        return null;
    }

    @Override
    public List<Staff> toEntity(List<StaffDto> dtoList) {
        return null;
    }

    @Override
    public List<StaffDto> toDto(List<Staff> entityList) {
        return null;
    }
}
