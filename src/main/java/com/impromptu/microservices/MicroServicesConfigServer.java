package com.impromptu.microservices;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

//@SpringBootApplication
@EnableConfigServer
public class MicroServicesConfigServer {
    public static void main(String[] args) {
        SpringApplication.run(MicroServicesConfigServer.class, args);
    }
}
