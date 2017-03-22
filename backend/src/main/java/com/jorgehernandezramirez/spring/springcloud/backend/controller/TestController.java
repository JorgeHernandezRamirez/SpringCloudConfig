package com.jorgehernandezramirez.spring.springcloud.backend.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Value("${variable}")
    private String variableFromConfigServer;

    public TestController(){
        //For Spring
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getVariableFromConfigServer() {
        return variableFromConfigServer;
    }
}