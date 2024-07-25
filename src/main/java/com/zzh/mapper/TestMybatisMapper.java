package com.zzh.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Author zzh
 * @Date 2024/7/25 下午3:45
 * @ClassName TestMybatisMapper
 * @Description mapper
 */
@Mapper
public interface TestMybatisMapper {
    public ArrayList<HashMap<String ,String>> getInfo();
}
