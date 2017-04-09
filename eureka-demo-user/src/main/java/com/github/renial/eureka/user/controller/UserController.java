package com.github.renial.eureka.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.renial.eureka.user.service.NotificationService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private NotificationService notificationService;

	@RequestMapping("/notification/getAll")
	public Object getAllNotifications() {
		return notificationService.getAll();
	}

}
