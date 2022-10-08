package com.spring.schoolmngtbackend.implementation;

import com.spring.schoolmngtbackend.bean.Students;
import com.spring.schoolmngtbackend.dto.StudentDto;
import com.spring.schoolmngtbackend.service.AllServices;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class StudentsImpl implements AllServices<Students, StudentDto> {
    @Override
    public Optional<Students> getById(long id) {
        return Optional.empty();
    }

    @Override
    public List<Students> getAll() {
        return null;
    }

    @Override
    public Students create(StudentDto dto) {
        return null;
    }

    @Override
    public Students update(StudentDto dto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
