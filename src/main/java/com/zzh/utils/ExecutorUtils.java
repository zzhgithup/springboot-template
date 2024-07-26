package com.zzh.utils;

import com.zzh.pojo.ExecutorInfo;

import java.util.concurrent.*;

/**
 * @Author zzh
 * @Date 2024/7/26 上午10:24
 * @ClassName ExecutorUtils
 * @Description 线程池工具
 */
public class ExecutorUtils {

    // 创建自定义线程池
    public static ThreadPoolExecutor threadPoolExecutor(ExecutorInfo executor){
        return new ThreadPoolExecutor(
                executor.getCorePoolSize(),
                executor.getMaxPoolSize(),
                executor.getKeepAliveTime(),
                executor.getUnit(),
                executor.getWorkQueue(),
                executor.getThreadFactory(),
                executor.getHandler());
    }


    //创建定时任务线程池
    public static ScheduledThreadPoolExecutor scheduledThreadPoolExecutor(int corePoolSize){
        return new ScheduledThreadPoolExecutor(corePoolSize);
    }

}
