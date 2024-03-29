package com.jpblancodb.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/greeting")
public class GreetingController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String greeting(){
        return "hello world";
    }
}
