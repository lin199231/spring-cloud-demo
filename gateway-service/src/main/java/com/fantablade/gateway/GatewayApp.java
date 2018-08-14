package com.fantablade.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaClient
@EnableZuulProxy
@SpringCloudApplication
public class GatewayApp {
    public static void main( String[] args ) {
        SpringApplication.run(GatewayApp.class, args);
    }
}
