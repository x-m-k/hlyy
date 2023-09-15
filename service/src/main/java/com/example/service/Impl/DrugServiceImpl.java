package com.example.service.Impl;


import com.example.mapper.DrugMapper;
import com.example.model.Drug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.service.DrugService;


@Service("drugService")
public class DrugServiceImpl implements DrugService {
    @Autowired
    private DrugMapper drugMapper;

   public int deleteByPrimaryKey(String id) {
        return 0;
    }

    public int insert(Drug record) {
        return 0;
    }

    public int insertSelective(Drug record){
        return 0;
    };

    public Drug selectByPrimaryKey(String id){
       Drug drug=drugMapper.selectByPrimaryKey(id);
       return  drug;
    };

    public int updateByPrimaryKeySelective(Drug record) {
        return 0;
    }

    public int updateByPrimaryKey(Drug record) {
        return 0;
    }
}
