package com.spring.schoolmngtbackend.implementation;

import com.spring.schoolmngtbackend.bean.Staff;
import com.spring.schoolmngtbackend.dto.StaffDto;
import com.spring.schoolmngtbackend.service.AllServices;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class StaffImpl implements AllServices<Staff, StaffDto> {
    @Override
    public Optional<Staff> getById(long id) {
        return Optional.empty();
    }

    @Override
    public List<Staff> getAll() {
        return null;
    }

    @Override
    public Staff create(StaffDto dto) {
        return null;
    }

    @Override
    public Staff update(StaffDto dto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
