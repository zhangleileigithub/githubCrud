package com.gongsi.githubcrud.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 张雷雷
 * 2022/10/8
 */
/*
* 使用redis监控实现秒杀时的 防止超卖的现象
* 使用时需打开redis服务器，windows中 redis.cli
* */
public class RedisMonitor {
    public static void main(String[] arg) {
        String redisKey = "lock";
        ExecutorService executorService = Executors.newFixedThreadPool(20);//20个线程
        try {//初始化
            Jedis jedis = new Jedis("127.0.0.1", 6379);
            // 初始值
            jedis.set(redisKey, "0");
            jedis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 1000; i++) {//尝试1000次
            executorService.execute(() -> {
                Jedis jedis1 = new Jedis("127.0.0.1", 6379);
                try {
                    jedis1.watch(redisKey);
                    String redisValue = jedis1.get(redisKey);
                    int valInteger = Integer.valueOf(redisValue);
                    String userInfo = UUID.randomUUID().toString();
                    // 没有秒完
                    if (valInteger < 20) {//redisKey
                        Transaction tx = jedis1.multi();//开启事务
                        tx.incr(redisKey);//自增
                        List list = tx.exec();//提交事务，如果返回nil则说明执行失败，因为我watch了的，只要执行失败，则
                        // 进来发现东西还有，秒杀成功
                        if (list != null && list.size() > 0) {
                            System.out.println("用户：" + userInfo + "，秒杀成功！当前成功人数：" + (valInteger + 1));
                        } else {//执行结果不是OK，说明被修改了，被别人抢了
                            System.out.println("用户：" + userInfo + "，秒杀失败");
                        }
                    } else {//东西秒完了
                        System.out.println("已经有20人秒杀成功，秒杀结束");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {//关闭redis
                    jedis1.close();
                }
            });
        }
        executorService.shutdown();//关闭线程池
    }
}
