package com.irelint.functionProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by Administrator on 2015-7-24.
 */

@FunctionalInterface
public interface IntHandler {
    void handle(int i);
    default void run(){

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        boolean value = false;
        numbers.forEach(integer -> System.out.println(value));

        Optional<String> fullName = Optional.ofNullable(null);

        System.out.println("Full Name is set?"+ fullName.isPresent());

        System.out.println("Full Name :"  + fullName.orElseGet(() ->"[]"));



        System.out.println("hello");

    }
}
