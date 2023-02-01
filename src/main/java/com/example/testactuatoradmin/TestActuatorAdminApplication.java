package com.example.testactuatoradmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class TestActuatorAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestActuatorAdminApplication.class, args);
    }

}
