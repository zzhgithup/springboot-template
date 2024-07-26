package com.zzh.config;

import com.zaxxer.hikari.util.UtilityElf;
import com.zzh.pojo.ExecutorInfo;
import com.zzh.utils.DefaultThreadFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author zzh
 * @Date 2024/7/26 上午11:28
 * @ClassName BeanConfig
 * @Description TODO
 */
@Configuration
public class BeanConfig {

    @Bean(name = "ExecutorInfo")
    public ExecutorInfo executorInfo() {
        //                                                                                              SynchronousQueue:阻塞队列
        return new ExecutorInfo(5, 10, 10, TimeUnit.NANOSECONDS,new LinkedBlockingQueue<>(100), new DefaultThreadFactory("api"), new ThreadPoolExecutor.AbortPolicy());
    }

    @Bean(name = "ReentrantLock")
    public ReentrantLock reentrantLock() {
        return new ReentrantLock();
    }
}
