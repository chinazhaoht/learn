package com.irelint.paraller;

import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Administrator on 2015-8-28.
 */
public class ParallelArrays {
    public static void main(String[] args){
        Long[] arrayOfLong = new Long[20000];
        Arrays.parallelSetAll(arrayOfLong,
                index-> ThreadLocalRandom.current().nextLong(1000000));
        Arrays.stream(arrayOfLong).limit(10).forEach(
                i -> System.out.println(i + " ")
        );
        System.out.println();
        Arrays.parallelSort(arrayOfLong);
        Arrays.stream(arrayOfLong).limit(10).forEach(
                i -> System.out.println(i + " ")
        );

        System.out.println();
    }
}
