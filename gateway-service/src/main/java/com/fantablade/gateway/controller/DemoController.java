package com.fantablade.gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController
public class DemoController implements Serializable {
    private static final long serialVersionUID = 5591114365587543621L;

    @RequestMapping("test")
    public String test() {
        return "success";
    }
}
