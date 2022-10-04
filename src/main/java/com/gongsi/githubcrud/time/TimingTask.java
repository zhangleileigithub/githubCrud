package com.gongsi.githubcrud.time;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 张雷雷
 * 2022/10/4
 */
@Component
public class TimingTask {

//    @Scheduled(cron = "*/5 * * * * ?") 启动后立即执行，之后每隔5秒执行一次
    @Scheduled(cron = "0/30 * * * * ?")
    public void timeTask(){
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = format.format(date);
        System.out.println("执行了定时任务，每隔30秒执行一次,当前时间是："+dateStr);


    }
}
