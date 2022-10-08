package com.spring.schoolmngtbackend.implementation;

import com.spring.schoolmngtbackend.bean.Instructor;
import com.spring.schoolmngtbackend.dto.InstructorDto;
import com.spring.schoolmngtbackend.service.AllServices;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class InstructorImp implements AllServices<Instructor, InstructorDto> {
    @Override
    public Optional<Instructor> getById(long id) {
        return Optional.empty();
    }

    @Override
    public List<Instructor> getAll() {
        return null;
    }

    @Override
    public Instructor create(InstructorDto dto) {
        return null;
    }

    @Override
    public Instructor update(InstructorDto dto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
