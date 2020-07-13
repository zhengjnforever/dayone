package com.example.dayone.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Map;

/**
 * @program: dayone
 * @description: 对象类
 * @author: Sam
 * @create: 2020-07-13 11:16
 **/

@Component
@PropertySource(value = {"classpath:myconfig.properties"})
@ConfigurationProperties(prefix = "person")
public class Person {


    private int age;

    @Email
    private String name;

    @NotNull
    private boolean sex;

    List<String> list;

    Map<String,Object> map;

    Cat cat;

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

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", list=" + list +
                ", map=" + map +
                ", cat=" + cat +
                '}';
    }
}
