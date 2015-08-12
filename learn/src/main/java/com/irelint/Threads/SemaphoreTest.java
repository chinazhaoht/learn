package com.irelint.Threads;

import sun.applet.Main;

import javax.swing.*;
import java.io.StringWriter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * Created by Administrator on 2015-8-12.
 */
public class SemaphoreTest {

    public static void main(String[] args){
        ExecutorService exec  = Executors.newCachedThreadPool();
        final Semaphore semp  = new Semaphore(5);
        for(int index  =  0;index < 10;index++){
            final int num = index;
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    /*try{
                       //semp.acquire();
                        System.out.println();
                      //  ;
                    }*/
                }
            };
        }
    }


}
