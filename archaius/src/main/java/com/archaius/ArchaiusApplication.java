package com.archaius;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Lenovo
 */
@SpringBootApplication
@EnableEurekaClient
public class ArchaiusApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArchaiusApplication.class, args);
    }
}
