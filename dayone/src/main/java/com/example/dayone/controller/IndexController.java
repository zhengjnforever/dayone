package com.example.dayone.controller;

import com.example.dayone.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * @program: dayone
 * @description: 首页访问
 * @author: Sam
 * @create: 2020-07-13 10:48
 **/


@RestController

public class IndexController {

    @Autowired
    private Person person;

    @RequestMapping("/hello")
    public String sayhello(){
        System.out.println(person);

        return "hello";

    }



}
