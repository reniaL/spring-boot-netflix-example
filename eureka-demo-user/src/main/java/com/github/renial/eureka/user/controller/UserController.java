package com.github.renial.eureka.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.renial.eureka.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public Object create(String name) {
		userService.create(name);
		return ResponseEntity.ok("success");
	}
	
	@RequestMapping("/getOne")
	public Object getOne(Integer id) {
		return userService.getOne(id);
	}
	
	@RequestMapping("/getAll")
	public Object getAll() {
		return userService.getAll();
	}
	
}
