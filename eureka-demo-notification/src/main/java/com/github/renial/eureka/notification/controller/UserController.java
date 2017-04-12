package com.github.renial.eureka.notification.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.renial.eureka.notification.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/getOne")
	public Object getOne(Integer id) {
		return userService.getOne(id);
	}
	
	@RequestMapping("/getAll")
	public Object getAll() {
		return userService.getAll();
	}
	
}
