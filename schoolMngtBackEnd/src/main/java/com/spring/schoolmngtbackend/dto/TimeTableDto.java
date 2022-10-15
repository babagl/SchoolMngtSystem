package com.spring.schoolmngtbackend.dto;

import com.spring.schoolmngtbackend.bean.Instructor;
import lombok.AllArgsConstructor;
import lombok.Data;


import java.util.List;
@Data
@AllArgsConstructor
public class TimeTableDto {
    private long idTimeTable;
    private String matiere;
    private String StartTime;
    private String EndTime;
    List<InstructorDto> instructorsDtos;
}
