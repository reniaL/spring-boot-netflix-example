package com.github.renial.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.system.ApplicationPidFileWriter;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(EurekaServer.class);
        app.addListeners(new ApplicationPidFileWriter("server.pid"));
        app.run(args);
    }

}
