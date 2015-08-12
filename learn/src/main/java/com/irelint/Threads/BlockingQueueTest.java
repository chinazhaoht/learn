package com.irelint.Threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by Administrator on 2015-8-12.
 */
public class BlockingQueueTest {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> bqueue = new ArrayBlockingQueue<String>(20);
        for(int i = 0;i <30;i++){
            bqueue.put("" + i);
            System.out.println("向队列中添加元素"+i);
            if(i>18){
                System.out.println("移除元素" + bqueue.take());
            }
        }
        System.out.println("结束");
    }
}

