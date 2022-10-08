package com.spring.schoolmngtbackend.mapper;

import com.spring.schoolmngtbackend.bean.Administrator;
import com.spring.schoolmngtbackend.bean.Instructor;
import com.spring.schoolmngtbackend.bean.Staff;
import com.spring.schoolmngtbackend.bean.TimeTable;
import com.spring.schoolmngtbackend.dto.AdministratorDto;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Component
public class AdministratorMapper implements EntityMapper<Administrator, AdministratorDto> {

    InstructorMapper instructorMapper = new InstructorMapper();
    TimeTableMapper timeTableMapper = new TimeTableMapper();
    StaffMapper staffMapper = new StaffMapper();
    @Override
    public Administrator toEntity(AdministratorDto dto) {
        Administrator administrator = new Administrator();
        administrator.setFullName(dto.getFullName());
        administrator.setUserName(dto.getUserName());
        administrator.setEmail(dto.getEmail());
        administrator.setPassword(dto.getPassword());
        administrator.setBirthday(LocalDate.parse(dto.getBirthday()));
        administrator.setAddress(dto.getAddress());
        List<Instructor> instructorList = instructorMapper.toEntity(dto.getInstructorDtos());
        administrator.setInstructors(instructorList);
        List<TimeTable> timeTableList = timeTableMapper.toEntity(dto.getTimeTableDtos());
        administrator.setTimeTables(timeTableList);
        List<Staff> staffList = staffMapper.toEntity(dto.getStaffDtos());
        administrator.setStaff(staffList);
        return administrator;
    }

    @Override
    public AdministratorDto toDto(Administrator entity) {
        return null;
    }

    @Override
    public List<Administrator> toEntity(List<AdministratorDto> dtoList) {
        return null;
    }

    @Override
    public List<AdministratorDto> toDto(List<Administrator> entityList) {
        return null;
    }
}
