package com.fantablade.order.controller;

import com.fantablade.order.service.SmsService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController
public class OrderController implements Serializable {
    private static final long serialVersionUID = 2631287680796481343L;

    @Autowired
    private SmsService smsService;

    @RequestMapping("test")
    @HystrixCommand(fallbackMethod="fallback")
    public String orderTest() {
        return "order service, " + smsService.send("order message");
    }

    public String fallback() {
        return "service disable";
    }
}