package com.irelint.functionProgramming.word;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;

/**
 * Created by Administrator on 2015-8-29.
 */
public class ReaderFile  {
    public static void main(String[] args) throws IOException {

        String fileName = "F:\\learn\\learn\\src\\main\\resources\\txt\\catalina.2015-07-06.log";
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);


            String line = bufferedReader.readLine();
            while(line != null){
                line = bufferedReader.readLine();
                System.out.println(line);
            }

       /* FutureTask futureTask = new FutureTask(new ReaderFile());
        new Thread(futureTask);*/
    }
}
