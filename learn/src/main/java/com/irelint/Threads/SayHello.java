package com.irelint.Threads;

/**
 * Created by Administrator on 2015-8-12.
 */
public class SayHello implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello!");
    }
}
