package com.example.service;

import com.example.model.Drug;


public interface DrugService {
    int deleteByPrimaryKey(String id);

    int insert(Drug record);

    int insertSelective(Drug record);

    Drug selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Drug record);

    int updateByPrimaryKey(Drug record);

}
