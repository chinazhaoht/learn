package com.irelint.Threads.Demo1;

import sun.plugin2.main.client.PluginMain;

import java.lang.management.PlatformManagedObject;

/**
 * Created by Administrator on 2015-8-21.
 */
public class Interrupted {
    public static void main(String[] args) throws InterruptedException {
        InterruptedJob ij = new InterruptedJob();
        ij.setName("InterruptedJobThread");
        ij.start();
        Thread.sleep(2000);
        //ÖÐ¶Ï
        ij.interrupt();
        System.out.println("INTERRUPTEDIJ");
        Thread.sleep(2000);
    }

    static class InterruptedJob extends Thread {
        public void run() {
            try {
                while (true) {
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println("CURRENTINTERRUPT STAUS IS" +
                        Thread.currentThread().getName() +
                        Thread.currentThread().isInterrupted());
                Thread.currentThread().interrupt();
            }
        }
    }
}
