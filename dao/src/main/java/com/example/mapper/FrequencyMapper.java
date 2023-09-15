package com.example.mapper;


import com.example.model.Frequency;

public interface FrequencyMapper {
    int deleteByPrimaryKey(String id);

    int insert(Frequency record);

    int insertSelective(Frequency record);

    Frequency selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Frequency record);

    int updateByPrimaryKey(Frequency record);
}