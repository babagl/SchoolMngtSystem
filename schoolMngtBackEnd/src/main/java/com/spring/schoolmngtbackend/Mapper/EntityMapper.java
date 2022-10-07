package com.spring.schoolmngtbackend.Mapper;

import java.util.List;

public interface EntityMapper <A,B>{
    public A toEntity(B dto);

    public B ToDto(A entity);

    List<A> toEntity(List<B> dtoList);

    List<B> toDto(List<A> entityList);
}
