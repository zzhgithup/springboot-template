package com.zzh.controller;

import com.zzh.service.TestData;
import com.zzh.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
* @Author zzh
* @Date 2024/6/26 下午4:20
* @ClassName TestController
* @Description 测试用例
*/
@RestController
@Slf4j
public class TestController {

    @Autowired
    private TestData testData;
    @GetMapping("select")
    public Result select(){
        return Result.ok().data("name","zzh").data("age",18);
    }

    @PostMapping("insert")
    public Result insert(){
        return Result.ok().data("data","insert");
    }

    @PutMapping("update")
    public Result update(){
        return Result.ok().data("data","update");
    }

    @DeleteMapping("delete")
    public Result delete(){
        return Result.ok().data("data","delete");
    }

    @GetMapping("log")
    public Result log(){
        log.debug("debug");
        log.info("info");
        log.warn("info");
        log.error("info");
        return Result.ok().msg("日志数据测试");
    }

    @GetMapping("error")
    public Result error(){
        int i = testData.testNull();
        return Result.error().msg("错误数据测试");
    }

    @GetMapping("db")
    public Result db(){
        String users = testData.testDB();
        return Result.ok().data("user",users);
    }
}
