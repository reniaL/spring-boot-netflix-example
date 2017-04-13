package com.github.renial.eureka.user.controller;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.renial.eureka.user.service.NotificationService;

@RestController
@RequestMapping("/notification")
public class NotificationController {
	
	@Autowired
	private NotificationService notificationService;
	
	@RequestMapping("/getOne")
	public Object getOneNotifications(Integer id, Boolean wait) {
		return notificationService.getOne(id, wait);
	}
	
	@RequestMapping("/getList")
	public Object getNotificationList(String ids, Boolean wait) {
		return notificationService.getList(
				Arrays.stream(ids.split(",")).map(Integer::parseInt).collect(Collectors.toList()), wait);
	}
	
	@RequestMapping("/getAll")
	public Object getAllNotifications() {
		return notificationService.getAll();
	}
	
}
