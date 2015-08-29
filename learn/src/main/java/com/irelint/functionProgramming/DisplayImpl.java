package com.irelint.functionProgramming;

/**
 * Created by Administrator on 2015-8-28.
 */
public class DisplayImpl implements Display {
    public String say() {
        System.out.println("say");
        return "";
    }

    @Override
    public String hello() {
        return "hi";
    }
}
