package com.zzh.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author zzh
 * @Date 2024/7/25 下午2:40
 * @ClassName CorsConfig
 * @Description 全局跨域配置，除此方法外还可以配置单个接口跨域用法@CrossOrigin
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // 注册一个跨域映射
        registry.addMapping("/**") // 所有的请求路径都允许跨域
                .allowedOrigins("*") // 允许所有源
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // 允许的HTTP方法
                .allowedHeaders("*") // 允许所有头
//                .allowCredentials(true) // 允许携带cookie
                .maxAge(3600); // 预检请求的有效期，单位秒
    }
}
