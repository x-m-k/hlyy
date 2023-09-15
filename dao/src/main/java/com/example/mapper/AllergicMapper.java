package com.example.mapper;


import com.example.model.Allergic;

public interface AllergicMapper {
    int deleteByPrimaryKey(String id);

    int insert(Allergic record);

    int insertSelective(Allergic record);

    Allergic selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Allergic record);

    int updateByPrimaryKey(Allergic record);
}