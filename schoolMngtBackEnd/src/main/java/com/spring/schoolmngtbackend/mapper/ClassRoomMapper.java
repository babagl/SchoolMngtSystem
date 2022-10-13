package com.spring.schoolmngtbackend.mapper;

import com.spring.schoolmngtbackend.bean.ClassRoom;
import com.spring.schoolmngtbackend.bean.Students;
import com.spring.schoolmngtbackend.dto.ClassRoomDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClassRoomMapper implements EntityMapper<ClassRoom, ClassRoomDto> {

    @Autowired
    private StudentMapper studentMapper;
    @Override
    public ClassRoom toEntity(ClassRoomDto dto) {
        ClassRoom classRoom = new ClassRoom();
        classRoom.setClassName(dto.getClassName());
        List<Students> studentsList = studentMapper.toEntity(dto.getStudentDtos());
        classRoom.setStudents(studentsList);
        return classRoom;
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
