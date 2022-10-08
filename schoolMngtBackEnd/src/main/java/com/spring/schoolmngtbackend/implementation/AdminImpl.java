package com.spring.schoolmngtbackend.implementation;

import com.spring.schoolmngtbackend.bean.Administrator;
import com.spring.schoolmngtbackend.dto.AdministratorDto;
import com.spring.schoolmngtbackend.mapper.AdministratorMapper;
import com.spring.schoolmngtbackend.repo.AdministratorRepo;
import com.spring.schoolmngtbackend.service.AdministratorService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AdminImpl implements AdministratorService {
    private final AdministratorRepo repo;
    private final AdministratorMapper mapper;

    public AdminImpl(AdministratorRepo repo, AdministratorMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }



    @Override
    public Optional<Administrator> getById(long id) {
        return repo.findById(id);
    }

    @Override
    public List<Administrator> getAll() {
        return repo.findAll();
    }

    @Override
    public Administrator create(AdministratorDto dto) {
        Administrator administrator = mapper.toEntity(dto);
        return repo.save(administrator);
    }

    @Override
    public Administrator update(AdministratorDto dto) {
        Administrator administrator = mapper.toEntity(dto);
        administrator.setIdAdministrator(dto.getIdAdministrator());
        return repo.save(administrator);
    }

    @Override
    public void delete(long id) {
        repo.deleteById(id);
    }
}
