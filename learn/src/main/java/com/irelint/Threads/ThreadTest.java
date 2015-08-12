package com.irelint.Threads;

/**
 * Created by Administrator on 2015-8-11.
 */
public class ThreadTest {
    public static void main(String[] args){
        SimpleThread simpleThread1 = new SimpleThread();
        SimpleThread simpleThread2 = new SimpleThread();
        simpleThread1.start();
        simpleThread2.start();
    }
}
