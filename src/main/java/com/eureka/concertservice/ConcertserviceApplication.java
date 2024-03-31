package com.eureka.concertservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ConcertserviceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConcertserviceApplication.class, args);
    }

}
