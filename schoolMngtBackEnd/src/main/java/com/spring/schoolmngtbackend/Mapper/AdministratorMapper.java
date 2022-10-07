package com.spring.schoolmngtbackend.Mapper;

import com.spring.schoolmngtbackend.bean.Administrator;
import com.spring.schoolmngtbackend.dto.AdministratorDto;

import java.util.List;

public class AdministratorMapper implements EntityMapper<Administrator, AdministratorDto> {
    @Override
    public Administrator toEntity(AdministratorDto dto) {
        return null;
    }

    @Override
    public AdministratorDto ToDto(Administrator entity) {
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
