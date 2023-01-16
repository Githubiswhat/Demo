package com.example.controller;

import com.example.service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    //设置 produces 防止中文乱码
    @GetMapping(value = "/test", produces = "text/plain;charset=utf-8")
    public String test() {
        String str = service.getTest();
        System.out.println("------MyController " + str + "----------");
        return str;
    }
}
