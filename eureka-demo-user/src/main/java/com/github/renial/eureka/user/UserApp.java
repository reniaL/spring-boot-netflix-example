package com.github.renial.eureka.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.system.ApplicationPidFileWriter;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@EnableEurekaClient
@EnableCircuitBreaker
@EnableHystrixDashboard
@EnableFeignClients
public class UserApp {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(UserApp.class);
		app.addListeners(new ApplicationPidFileWriter("user.pid"));
		app.run(args);
	}

}
