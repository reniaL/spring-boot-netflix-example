package com.github.renial.eureka.notification.service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.renial.eureka.notification.model.Notification;
import com.github.renial.eureka.notification.repository.NotificationRepository;

@Service
public class NotificationService {

	@Autowired
	private NotificationRepository notificationRepository;

	public void create() {
		notificationRepository.create(new Notification(UUID.randomUUID().toString(), new Date()));
	}
	
	public List<Notification> getAll() {
		return notificationRepository.getAll();
	}

}
