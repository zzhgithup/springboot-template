package com.zzh;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @Author zzh
 * @Date 2024/7/25 下午2:50
 * @ClassName AppStartInit
 * @Description 打包初始化启动类
 */
public class AppStartInit extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(AppStart.class);
    }
}