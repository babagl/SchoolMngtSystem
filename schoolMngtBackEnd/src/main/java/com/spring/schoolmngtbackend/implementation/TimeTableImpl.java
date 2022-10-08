package com.spring.schoolmngtbackend.implementation;

import com.spring.schoolmngtbackend.bean.TimeTable;
import com.spring.schoolmngtbackend.dto.TimeTableDto;
import com.spring.schoolmngtbackend.service.AllServices;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TimeTableImpl implements AllServices<TimeTable, TimeTableDto> {
    @Override
    public Optional<TimeTable> getById(long id) {
        return Optional.empty();
    }

    @Override
    public List<TimeTable> getAll() {
        return null;
    }

    @Override
    public TimeTable create(TimeTableDto dto) {
        return null;
    }

    @Override
    public TimeTable update(TimeTableDto dto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
