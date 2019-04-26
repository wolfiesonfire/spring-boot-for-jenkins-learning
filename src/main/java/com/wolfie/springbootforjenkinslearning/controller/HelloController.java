package com.wolfie.springbootforjenkinslearning.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wolfie
 */
@RestController
public class HelloController {

    @Value("${just-some-param}")
    private String param;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello from " + param + ".";
    }

}
