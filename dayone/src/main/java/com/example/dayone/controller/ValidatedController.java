package com.example.dayone.controller;

import com.example.dayone.pojo.Cat;

import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: dayone
 * @description: 参数校验
 * @author: Sam
 * @create: 2020-07-13 14:42
 **/

@RestController
public class ValidatedController {

    @RequestMapping("test")
    public String test(@Validated Cat cat, BindingResult result){

        return result.getAllErrors().toString();

    }


}
