package com.example.dayone.pojo;

import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * @program: dayone
 * @description: 动物猫
 * @author: Sam
 * @create: 2020-07-13 11:18
 **/

public class Cat {

    @Max(value = 5,message = "这只猫太老了")
    @Min(value = 1,message = "这只猫太小了")
    private int age;

    @Email
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
