package com.spring.schoolmngtbackend.service;

import com.spring.schoolmngtbackend.bean.Administrator;
import com.spring.schoolmngtbackend.dto.AdministratorDto;

import java.util.List;
import java.util.Optional;

public interface AdministratorService {
    public Optional <Administrator> getById(long id);

    public List<Administrator> getAll();

    public Administrator create(AdministratorDto dto);

    public Administrator update(AdministratorDto dto);

    public void delete(long id);
}
