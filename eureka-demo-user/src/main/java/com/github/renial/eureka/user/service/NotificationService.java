package com.github.renial.eureka.user.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.renial.eureka.user.client.NotificationClient;
import com.github.renial.eureka.user.model.Notification;

@Service
public class NotificationService {
	
	@Autowired
	private NotificationClient notificationClient;
	
	public Notification getOne(Integer id) {
		return notificationClient.getOne(id);
	}
	
	public List<Notification> getList(List<Integer> ids) {
		return ids.stream().map(id -> notificationClient.getOne(id)).collect(Collectors.toList());
	}
	
	public List<Notification> getAll() {
		return notificationClient.getAll();
	}
	
}
