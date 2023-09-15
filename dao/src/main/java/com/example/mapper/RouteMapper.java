package com.example.mapper;


import com.example.model.Route;

public interface RouteMapper {
    int deleteByPrimaryKey(String id);

    int insert(Route record);

    int insertSelective(Route record);

    Route selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Route record);

    int updateByPrimaryKey(Route record);
}