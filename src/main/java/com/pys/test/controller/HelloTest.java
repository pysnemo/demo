package com.pys.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloTest {

    @RequestMapping("test")
    public String test() {
        return "Hello Test";
    }

}
