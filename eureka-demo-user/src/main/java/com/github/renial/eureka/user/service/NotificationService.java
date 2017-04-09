package com.github.renial.eureka.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.renial.eureka.user.client.NotificationClient;
import com.github.renial.eureka.user.model.Notification;

@Service
public class NotificationService {
	
	@Autowired
	private NotificationClient notificationClient;
	
	public List<Notification> getAll() {
		return notificationClient.getAll();
	}

}
