package com.zzh.service.impl;

import com.zzh.mapper.TestMybatisMapper;
import com.zzh.service.TestData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Author zzh
 * @Date 2024/7/25 下午1:50
 * @ClassName TestDataImpl
 * @Description TODO
 */
@Service
public class TestDataImpl implements TestData {
    @Autowired
    private TestMybatisMapper testMybatisMapper;
    @Override
    public int testError() {
        int a = 1/0;
        return a;
    }

    @Override
    public int testNull() {
        String nullString = null;
        return nullString.length();
    }

    @Override
    public List<HashMap<String, String>> testDB() {
        return testMybatisMapper.getInfo();
    }
}
