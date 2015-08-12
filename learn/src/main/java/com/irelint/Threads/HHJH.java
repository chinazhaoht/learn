package com.irelint.Threads;

import java.util.Stack;

/**
 * Created by Administrator on 2015-8-12.
 */
//MethodRequest接口定义
interface MethodRequest {
    public void call();
}

//ActiveQueue定义，其实就是一个producer/consumer队列
class ActiveQueue {
    public ActiveQueue() {
        _queue = new Stack();
    }

    public synchronized void enqueue(MethodRequest mr) {
        while (_queue.size() > QUEUE_SIZE) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        _queue.push(mr);
        notifyAll();
        System.out.println("Leave Queue");
    }

    public synchronized MethodRequest dequeue() {
        MethodRequest mr;

        while (_queue.empty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        mr = (MethodRequest) _queue.pop();
        notifyAll();

        return mr;
    }

    private Stack _queue;
    private final static int QUEUE_SIZE = 20;
}

//ActiveObject的定义
class ActiveObject extends Thread {
    public ActiveObject() {
        _queue = new ActiveQueue();
        start();
    }

    public void enqueue(MethodRequest mr) {
        _queue.enqueue(mr);
    }

    public void run() {
        while (true) {
            MethodRequest mr = _queue.dequeue();
            mr.call();
        }
    }

    private ActiveQueue _queue;
}