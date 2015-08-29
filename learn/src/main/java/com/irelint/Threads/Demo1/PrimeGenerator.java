package com.irelint.Threads.Demo1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.RunnableFuture;

/**
 * Created by Administrator on 2015-8-24.
 */
public class PrimeGenerator implements Runnable {

    private final List<BigInteger> primes
              =  new ArrayList<BigInteger>();
    private volatile boolean cancelled;

    @Override
    public void run() {
        BigInteger p = BigInteger.ONE;
        while(!cancelled){
            p = p.nextProbablePrime();
            synchronized (this){
                primes.add(p);
            }
        }
    }

    public void cancel(){
        cancelled  = true;
    }

    public synchronized List<BigInteger> get(){
        return new ArrayList<BigInteger>(primes);
    }

    public static void main(String[] args){
        Thread thread = new Thread(new PrimeGenerator());
        thread.start();
    }
}
