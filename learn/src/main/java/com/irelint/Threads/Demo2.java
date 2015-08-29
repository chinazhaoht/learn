package com.irelint.Threads;

import java.nio.file.FileSystemNotFoundException;
import java.util.Random;

/**
 * Created by Administrator on 2015-8-21.
 */
public class Demo2 {
    public static void main(String[] args){
         StringBuffer sb = new StringBuffer("h");
        int i = 1;
        while(true){
            Runnable task = new Runnable() {
                int i = new Random().nextInt();
                @Override
                public void run() {
                    System.out.println(i);
                }
            };
            while(true){
                new Thread(task).start();
            }

        }
    }
}
