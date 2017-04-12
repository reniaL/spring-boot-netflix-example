package com.github.renial.eureka.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.system.ApplicationPidFileWriter;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class UserApp {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(UserApp.class);
		app.addListeners(new ApplicationPidFileWriter("user.pid"));
		app.run(args);
	}

}
