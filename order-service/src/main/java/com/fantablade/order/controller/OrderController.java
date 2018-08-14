package com.fantablade.order.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController
public class OrderController implements Serializable {
    private static final long serialVersionUID = 2631287680796481343L;

    @RequestMapping("test")
    public String orderTest() {
        return "order service";
    }
}
