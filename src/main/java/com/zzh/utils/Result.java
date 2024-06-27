package com.zzh.utils;

import lombok.Data;

import java.util.HashMap;

/**
 * @Author zzh
 * @Date 2024/6/26 下午4:35
 * @ClassName Result
 * @Description 返回结果集
 */
@Data
public class Result {
    private Integer code;
    private String msg;
    private HashMap<String, Object> data = new HashMap<>();
    public static Result ok() {
        Result result = new Result();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMsg(ResultEnum.SUCCESS.getMsg());
        return result;
    }
    public static Result error() {
        Result result = new Result();
        result.setCode(ResultEnum.ERROR.getCode());
        result.setMsg(ResultEnum.ERROR.getMsg());
        return result;
    }
    public Result code(Integer code) {
        this.setCode(code);
        return this;
    }
    public Result msg(String msg) {
        this.setMsg(msg);
        return this;
    }
    public Result data(String key, Object value) {
        this.data.put(key, value);
        return this;
    }

    public Result data(HashMap<String, Object> map) {
        this.setData(map);
        return this;
    }
}
