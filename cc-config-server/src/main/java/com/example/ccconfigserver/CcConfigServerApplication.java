package com.example.ccconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CcConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CcConfigServerApplication.class, args);
    }

}
