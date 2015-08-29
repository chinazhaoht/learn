package com.irelint.Threads;

/**
 * Created by Administrator on 2015-8-11.
 */
public class ThreadTestOne {
    public static void main(String[] args) {
        SimpleThread simpleThread = new SimpleThread();
        Thread t = new Thread(simpleThread);
        t.start();
    }
}