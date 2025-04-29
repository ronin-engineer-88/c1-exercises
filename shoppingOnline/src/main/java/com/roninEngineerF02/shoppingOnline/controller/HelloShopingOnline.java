package com.roninEngineerF02.shoppingOnline.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloShopingOnline {

    @GetMapping("/hello")
    public String hello() {
        return "Hello shopping online project";
    }
}
