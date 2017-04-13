package com.github.renial.eureka.notification.controller;

import java.util.Random;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.renial.eureka.notification.service.NotificationService;

@RestController
@RequestMapping("/notification")
public class NotificationController {
	
	private static final Log log = LogFactory.getLog(NotificationController.class);
	
	@Autowired
	private NotificationService notificationService;
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public Object create() {
		notificationService.create();
		return ResponseEntity.ok("success");
	}
	
	@RequestMapping("/getOne")
	public Object getOne(Integer id, @RequestParam(defaultValue = "false") Boolean wait) throws InterruptedException {
		if (wait) {
			int rand = (new Random()).nextInt(5000);
			log.info("random wait: " + rand);
			if (rand < 1000) {
				return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
			}
			Thread.sleep(rand);
		}
		return notificationService.getOne(id);
	}
	
	@RequestMapping("/getAll")
	public Object getAll() {
		return notificationService.getAll();
	}
	
}
