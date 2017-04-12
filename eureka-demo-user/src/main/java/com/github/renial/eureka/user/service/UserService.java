package com.github.renial.eureka.user.service;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.renial.eureka.user.model.User;
import com.github.renial.eureka.user.repository.UserRepository;

@Service
public class UserService {
	
	private volatile AtomicInteger currendId = new AtomicInteger(1);
	
	@Autowired
	private UserRepository userRepository;
	
	public void create(String name) {
		userRepository.create(new User(getId(), name));
	}
	
	public User getOne(Integer id) {
		return userRepository.getOne(id);
	}
	
	public List<User> getAll() {
		return userRepository.getAll();
	}
	
	private Integer getId() {
		return currendId.getAndIncrement();
	}
	
}
