package com.example.dayone.pojo;

/**
 * @program: dayone
 * @description: 动物猫
 * @author: Sam
 * @create: 2020-07-13 11:18
 **/

public class Cat {

    private int age;

    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

}
