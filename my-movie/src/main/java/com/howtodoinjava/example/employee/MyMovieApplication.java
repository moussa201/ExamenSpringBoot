package com.howtodoinjava.example.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//@EnableHystrixDashboard
@EnableCircuitBreaker
public class MyMovieApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyMovieApplication.class, args);
    }
}
