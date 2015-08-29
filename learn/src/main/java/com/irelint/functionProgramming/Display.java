package com.irelint.functionProgramming;

/**
 * Created by Administrator on 2015-8-25.
 */
@FunctionalInterface
public interface Display {
    public String say();
    default String hello(){
        return "";
    }

}
