package com.fantablade.sms.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController
public class SmsController implements Serializable {
    private static final long serialVersionUID = 7967118897432290367L;

    @Value("${server.port}")
    private String port;

    @RequestMapping("send")
    public String sendMessage(String message) {
        return "sms service[" + port + "]-send message: " +message;
    }
}
