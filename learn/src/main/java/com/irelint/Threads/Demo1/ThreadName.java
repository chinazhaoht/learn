package com.irelint.Threads.Demo1;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.concurrent.RunnableFuture;

/**
 * Created by Administrator on 2015-8-21.
 */
public class ThreadName {
    public static void main(String[] args){
        Thread t = new Thread(new Job());
        t.setName("ThreadNameJob");
        t.start();
    }

    static class Job  implements Runnable{

        @Override
        public void run() {
            try {
                for(int i = 1;i<100;i++){
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().toString()+i);
                }


            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
