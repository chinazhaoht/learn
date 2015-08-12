package com.irelint.learn;

/**
 * Created by Administrator on 2015-4-22.
 */
public class UserImpl implements User {

    private int id;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int age;



    public void addUser() {
        System.out.println("UserImpl addUser....");

    }

    public void delUser(int id) {
        System.out.println("UserImpl delUser...");

    }

    public void updateUser(){
        System.out.println("UserImpl updateUser....");
    }
}
