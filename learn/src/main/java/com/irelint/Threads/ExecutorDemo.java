package com.irelint.Threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by Administrator on 2015-8-12.
 */
public class ExecutorDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorDemo executorDemo = new ExecutorDemo();
        executorDemo.hello();
        executorDemo.yes();
    }

    public void hello(){
        SayHello sayHello = new SayHello();

        ExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        ExecutorService executorService2 = Executors.newFixedThreadPool(10);
        executorService2.execute(sayHello);
    }

    public void yes() throws ExecutionException, InterruptedException {
        Future future = null;
        SayYes sayYes = new SayYes();
        ExecutorService executorService = Executors.newFixedThreadPool(20);
        future = executorService.submit(sayYes);

        if(future.isDone()){
            System.out.println(future.get());
        }


    }
}
