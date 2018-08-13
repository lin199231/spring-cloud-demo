package com.fantablade.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//@EnableEurekaServer
@SpringBootApplication
public class GatewayApp {
    public static void main( String[] args ) {
        SpringApplication.run(GatewayApp.class, args);
    }
}
