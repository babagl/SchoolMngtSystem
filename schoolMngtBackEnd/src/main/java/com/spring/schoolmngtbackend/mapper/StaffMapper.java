package com.spring.schoolmngtbackend.mapper;

import com.spring.schoolmngtbackend.bean.Roles;
import com.spring.schoolmngtbackend.bean.Staff;
import com.spring.schoolmngtbackend.dto.StaffDto;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class StaffMapper implements EntityMapper<Staff, StaffDto> {
    @Override
    public Staff toEntity(StaffDto dto) {
        Staff staff = new Staff();
        staff.setFullName(dto.getFullName());
        staff.setUsername(dto.getUsername());
        staff.setEmail(dto.getEmail());
        staff.setPassword(dto.getPassword());
        staff.setBirthday(LocalDate.of(2021,12,12));
        staff.setRoles(Roles.STAFF);
        return staff;
    }

    @Override
    public StaffDto toDto(Staff entity) {
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
