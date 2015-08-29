package com.irelint.Threads;

/**
 * Created by Administrator on 2015-8-11.
 */
public class SimpleThreadOne implements Runnable{

    @Override
    public void run() {
        Thread tempThread = new Thread(){
            public void run(){
                for(int i = 10 ;i<15;i++){
                    System.out.println(i);
                }
            }
        };
        tempThread.start();
            try {
                tempThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for(int i = 0;i<5;i++){
                System.out.println(i);
            }
        }
}
