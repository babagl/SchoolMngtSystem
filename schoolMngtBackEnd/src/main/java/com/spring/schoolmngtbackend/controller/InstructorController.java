package com.spring.schoolmngtbackend.controller;

import com.spring.schoolmngtbackend.bean.Instructor;
import com.spring.schoolmngtbackend.dto.InstructorDto;
import com.spring.schoolmngtbackend.implementation.InstructorImp;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Instructor")
public class InstructorController {

    private InstructorImp instructorImp;

    public InstructorController(InstructorImp instructorImp) {
        this.instructorImp = instructorImp;
    }

    @GetMapping("/{id}")
    public Optional<Instructor> getById(@PathVariable long id) {
        return instructorImp.getById(id);
    }

    @GetMapping()
    public List<Instructor> getAll() {
        return instructorImp.getAll();
    }

    @PostMapping
    public Instructor create(InstructorDto dto) {
        System.out.println(dto.getBirthday());
        return instructorImp.create(dto);
    }

    @PutMapping
    public Instructor update(InstructorDto dto) {

        return instructorImp.update(dto);
    }

    @DeleteMapping
    public void delete(long id) {
        instructorImp.delete(id);
    }
}
