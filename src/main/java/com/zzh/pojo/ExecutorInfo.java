package com.zzh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author zzh
 * @Date 2024/7/26 上午10:50
 * @ClassName ExecutorInfo
 * @Description 线程信息对象
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExecutorInfo {
    //核心线程数
    private int corePoolSize;
    //最大线程数
    private int maxPoolSize;
    //线程闲置时间
    private int keepAliveTime;
    //闲置时间单位
    //TimeUnit.MILLISECONDS（毫秒）
    //TimeUnit.SECONDS（秒）
    //TimeUnit.MINUTES（分钟）
    private TimeUnit unit;
    //任务队列：储存提交的线程
    private BlockingQueue<Runnable> workQueue;
    //线程工厂:指定创建线程的方式
    private ThreadFactory threadFactory;
    //拒绝策略:当达到最大线程时要做的处理
    private RejectedExecutionHandler handler;
}
