package com.fantablade.order.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("sms-service")
public interface SmsService {
    @RequestMapping("send")
    String send(@RequestParam("message") String message);
}
