package com.github.renial.eureka.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.system.ApplicationPidFileWriter;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class NotificationApp {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(NotificationApp.class);
		app.addListeners(new ApplicationPidFileWriter("notification.pid"));
		app.run(args);
	}
}
