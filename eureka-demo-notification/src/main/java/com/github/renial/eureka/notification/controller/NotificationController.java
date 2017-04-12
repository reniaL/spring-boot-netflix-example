package com.github.renial.eureka.notification.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.renial.eureka.notification.service.NotificationService;

@RestController
@RequestMapping("/notification")
public class NotificationController {

	@Autowired
	private NotificationService notificationService;

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public Object create() {
		notificationService.create();
		return ResponseEntity.ok("success");
	}

	@RequestMapping("/getOne")
	public Object getOne(Integer id) {
		return notificationService.getOne(id);
	}

	@RequestMapping("/getAll")
	public Object getAll() {
		return notificationService.getAll();
	}

}
