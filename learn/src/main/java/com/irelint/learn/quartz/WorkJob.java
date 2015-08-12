package com.irelint.learn.quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import static org.quartz.JobBuilder.newJob;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.TriggerBuilder.newTrigger;

/**
 * Created by Administrator on 2015-4-23.
 */

/**
 * @Author:zhaoht
 */
public class WorkJob implements Job {


    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("WorkJob execute start.....");

        Scheduler  scheduler;
        try {
            scheduler = StdSchedulerFactory.getDefaultScheduler();



            JobDetail job = newJob()
                    .withIdentity("myName","group1")
                    .build();


            Trigger trigger = newTrigger()
                    .withIdentity("myTrigger","group1")
                    .startNow().withSchedule(simpleSchedule()
                            .repeatForever()).build();

            scheduler.shutdown();



        } catch (SchedulerException e) {
            e.printStackTrace();
        }





    }
}

