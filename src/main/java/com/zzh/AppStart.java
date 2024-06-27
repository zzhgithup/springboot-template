package com.zzh;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
* @Author zzh
* @Date 2024/6/26 下午4:12
* @ClassName AppStart
* @Description 启动类
*/
@SpringBootApplication
public class AppStart {
    public static void main(String[] args) {
        SpringApplication.run(AppStart.class,args);
    }
    static {
        System.setProperty("druid.mysql.usePingMethod","false");
    }
}