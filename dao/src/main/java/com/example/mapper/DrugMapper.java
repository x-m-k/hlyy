package com.example.mapper;

import com.example.model.Drug;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DrugMapper {
    int deleteByPrimaryKey(String id);

    int insert(Drug record);

    int insertSelective(Drug record);

    Drug selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Drug record);

    int updateByPrimaryKey(Drug record);
}