package com.zzh.controller;

import com.zzh.utils.Result;
import org.springframework.web.bind.annotation.*;

/**
* @Author zzh
* @Date 2024/6/26 下午4:20
* @ClassName TestController
* @Description 测试用例
*/
@RestController
@CrossOrigin
public class TestController {
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
}
