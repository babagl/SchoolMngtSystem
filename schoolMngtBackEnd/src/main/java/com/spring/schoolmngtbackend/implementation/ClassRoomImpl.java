package com.spring.schoolmngtbackend.implementation;

import com.spring.schoolmngtbackend.bean.ClassRoom;
import com.spring.schoolmngtbackend.dto.ClassRoomDto;
import com.spring.schoolmngtbackend.service.AllServices;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ClassRoomImpl implements AllServices<ClassRoom, ClassRoomDto> {
    @Override
    public Optional<ClassRoom> getById(long id) {
        return Optional.empty();
    }

    @Override
    public List<ClassRoom> getAll() {
        return null;
    }

    @Override
    public ClassRoom create(ClassRoomDto dto) {
        return null;
    }

    @Override
    public ClassRoom update(ClassRoomDto dto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
