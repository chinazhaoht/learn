package com.irelint.learn.quartz;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;

//import static org.quartz.JobBuilder.newJob;
import static org.quartz.JobBuilder.*;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.TriggerBuilder.newTrigger;

/**
 * Created by Administrator on 2015-4-24.
 */
public class QuartzTest {
    public static void main(String[] args){
        try{
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

            scheduler.start();
            JobDetail job = newJob(HelloJob.class)
                    .withIdentity("job1","group1")
                    .build();


            JobDetail job2 = newJob(HelloJob.class).withIdentity("myJob2","group2")
                    .build();

            Trigger trigger2 = newTrigger().withIdentity("myTrigger","group2")
                    .startNow().withSchedule(simpleSchedule()
                    .withIntervalInSeconds(10)
                    .repeatForever())
                    .build();


            Trigger trigger1 = newTrigger()
                    .withIdentity("trigger1","group1")
                    .startNow()
                    .withSchedule(simpleSchedule()
                    .withIntervalInSeconds(40).repeatForever())
                    .build();

            scheduler.scheduleJob(job,trigger1);


            scheduler.shutdown();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }

}
