package com.irelint.Threads;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * Created by Administrator on 2015-8-12.
 */
public class SayYes implements Callable{
    @Override
    public Integer call() throws Exception {

        Random random = new Random(10);
        int number = random.nextInt();
        System.out.println("yes"+number);
        return null;
    }
}
