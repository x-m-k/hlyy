package com.example.controller;


import com.example.model.Drug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.service.DrugService;
import com.example.util.Result;

@RestController
@RequestMapping(value = {"/drug"}, produces = {"application/json;charset=UTF-8"})
public class drug {

    @Autowired
    private DrugService drugService;

    @PostMapping("/findById")
    public Result findById(String id) {
        Drug drug = drugService.selectByPrimaryKey(id);
        if (drug != null) {
            return Result.success(drug);
        } else {
            return Result.failed();
        }
    }

}
