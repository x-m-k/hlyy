package com.example.mapper;


import com.example.model.Disease;

public interface DiseaseMapper {
    int deleteByPrimaryKey(String id);

    int insert(Disease record);

    int insertSelective(Disease record);

    Disease selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Disease record);

    int updateByPrimaryKey(Disease record);
}