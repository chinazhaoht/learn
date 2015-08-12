package com.irelint.Threads;

/**
 * Created by Administrator on 2015-8-11.
 */
public class SimpleThread extends Thread {
    public void run(){
        for(int i = 0;i< 5;i++){
            System.out.println(i);
            try{
                sleep(20);
            }catch (InterruptedException e){
                System.out.println("Throw ");
            }
        }
    }
}
