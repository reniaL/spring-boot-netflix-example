package com.github.renial.eureka.notification.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.renial.eureka.notification.client.UserClient;
import com.github.renial.eureka.notification.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserClient userClient;
	
	public User getOne(Integer id) {
		return userClient.getOne(id);
	}
	
	public List<User> getAll() {
		return userClient.getAll();
	}
	
}
