package com.spring.schoolmngtbackend.controller;

import com.spring.schoolmngtbackend.bean.Administrator;
import com.spring.schoolmngtbackend.dto.AdministratorDto;
import com.spring.schoolmngtbackend.implementation.AdminImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Administrator")
public class AdminController {
    @Autowired
    private AdminImpl services;
    @GetMapping("/{id}")
    public Optional<Administrator> getById(@PathVariable long id) {
        return services.getById(id);
    }

   @GetMapping
    public List<Administrator> getAll() {
        return services.getAll();
    }

    @PostMapping
    public Administrator create(@RequestBody AdministratorDto dto) {
        return services.create(dto);
    }

    @PutMapping
    public Administrator update(@RequestBody AdministratorDto dto) {
        return services.update(dto);
    }

    @DeleteMapping
    public void delete(long id) {
        services.delete(id);
    }
}
