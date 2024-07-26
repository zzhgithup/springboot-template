package com.zzh.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @Author zzh
 * @Date 2024/7/25 下午1:49
 * @InterfaceName TestData
 * @Description 测试接口
 */

public interface TestData {
    public int testError();
    public int testNull();
    public List<HashMap<String, String>> testDB();
}
