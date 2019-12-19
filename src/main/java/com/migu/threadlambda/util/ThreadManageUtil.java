package com.migu.threadlambda.util;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Name: ThreadPoolManagerUtil
 * Description: 线程池统一管理
 * Date:     2018/9/11 14:50
 *
 * @Author: hebo
 * @see
 * @since JDK 1.8
 */
public class ThreadManageUtil {
    private static final int DEFAULT_CORE_SIZE = 5;
    private static final int MAX_QUEUE_SIZE = 5;
    private volatile static ThreadPoolExecutor executor;

    // 获取单例的线程池对象
    public static ThreadPoolExecutor getInstance() {
        if (executor == null) {
            synchronized (ThreadManageUtil.class) {
                if (executor == null) {
                    executor = new ThreadPoolExecutor(
                            DEFAULT_CORE_SIZE,// 核心线程数
                            MAX_QUEUE_SIZE, // 最大线程数
                            Integer.MAX_VALUE, // 闲置线程存活时间
                            TimeUnit.MILLISECONDS,// 时间单位
                            new LinkedBlockingDeque<>(Integer.MAX_VALUE),// 无界队列
                            Executors.defaultThreadFactory()
                    );
                }
            }
        }
        return executor;
    }

    public static void execute(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        getInstance().execute(runnable);
    }

    // 从线程队列中移除对象
    public void cancel(Runnable runnable) {
        getInstance().getQueue().remove(runnable);
    }

}
