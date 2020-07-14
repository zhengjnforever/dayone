package com.example.dayone.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: dayone
 * @description: restfull风格
 * @author: Sam
 * @create: 2020-07-14 14:21
 **/

@RestController

public class RestfullController {

    @DeleteMapping("/artical/{id}")
    public String deleteway(@PathVariable("id")String id){
        System.out.println(id);
        return id;
    }

    @PutMapping("/artical/{id}")
    public String putway(@PathVariable("id")String id){
        System.out.println(id);
        return id;
    }
}
