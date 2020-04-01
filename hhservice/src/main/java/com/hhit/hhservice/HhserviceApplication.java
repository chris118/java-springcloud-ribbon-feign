package com.hhit.hhservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HhserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HhserviceApplication.class, args);
    }

}
