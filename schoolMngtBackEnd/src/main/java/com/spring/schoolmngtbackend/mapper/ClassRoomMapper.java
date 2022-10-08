package com.spring.schoolmngtbackend.mapper;

import com.spring.schoolmngtbackend.bean.ClassRoom;
import com.spring.schoolmngtbackend.dto.ClassRoomDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClassRoomMapper implements EntityMapper<ClassRoom, ClassRoomDto> {

    @Override
    public ClassRoom toEntity(ClassRoomDto dto) {
        return null;
    }

    @Override
    public ClassRoomDto toDto(ClassRoom entity) {
        return null;
    }

    @Override
    public List<ClassRoom> toEntity(List<ClassRoomDto> dtoList) {
        return null;
    }

    @Override
    public List<ClassRoomDto> toDto(List<ClassRoom> entityList) {
        return null;
    }
}
