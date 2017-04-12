package com.github.renial.eureka.user.repository;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.github.renial.eureka.user.model.User;

@Repository
public class UserRepository {
	
	private Map<Integer, User> userMap = new LinkedHashMap<>();
	
	public void create(User user) {
		userMap.put(user.getId(), user);
	}
	
	public User getOne(Integer id) {
		return userMap.get(id);
	}
	
	public List<User> getAll() {
		return new ArrayList<>(userMap.values());
	}
	
}
