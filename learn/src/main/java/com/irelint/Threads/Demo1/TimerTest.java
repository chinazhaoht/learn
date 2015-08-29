package com.irelint.Threads.Demo1;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * Created by Administrator on 2015-8-21.
 */
public class TimerTest {

    private Integer i = 0;
    public static void main(String[] args){
        int i = 0;
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {

                System.out.println(new TimerTest().getI());
            }
        };

        Timer timer = new Timer();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
/*        scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor()*/
        while(true){
            timer.schedule(timerTask,new Date());
        }

    }

    public Integer getI() {
        i++;
        return i;
    }

    public void setI(Integer i) {
        this.i = i;
    }
}
