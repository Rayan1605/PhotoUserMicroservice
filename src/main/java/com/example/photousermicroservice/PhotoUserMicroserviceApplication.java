package com.example.photousermicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // This will make it a client and communicate with the discovery service
public class PhotoUserMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotoUserMicroserviceApplication.class, args);
    }

}
