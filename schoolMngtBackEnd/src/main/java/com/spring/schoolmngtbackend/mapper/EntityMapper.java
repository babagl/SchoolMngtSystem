package com.spring.schoolmngtbackend.mapper;

import java.util.List;

public interface EntityMapper <A,B>{
    public A toEntity(B dto);

    public B toDto(A entity);

    List<A> toEntity(List<B> dtoList);

    List<B> toDto(List<A> entityList);
}
