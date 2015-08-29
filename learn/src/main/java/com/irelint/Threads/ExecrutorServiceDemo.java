package com.irelint.Threads;

import java.util.concurrent.*;

import static java.lang.Thread.sleep;

/**
 * Created by Administrator on 2015-8-29.
 */
public class ExecrutorServiceDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService  = Executors.newFixedThreadPool(10);

        Callable<Object> callable = new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                sleep(1000);
                System.out.println("Helli");
                System.out.println(Thread.currentThread().getName());
                return Thread.currentThread();
            }
        };

        FutureTask futureTask = new FutureTask(callable);

        Future future = executorService.submit(callable);
        System.out.println(future.isDone());
        if(future.isDone()){
            System.out.println(future.isCancelled());
        }

    }
}
