package com.github.renial.eureka.notification.service;

import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.renial.eureka.notification.model.Notification;
import com.github.renial.eureka.notification.repository.NotificationRepository;

@Service
public class NotificationService {

	private volatile AtomicInteger currentId = new AtomicInteger(1);

	@Autowired
	private NotificationRepository notificationRepository;

	public void create() {
		notificationRepository.create(new Notification(getId(), new Date()));
	}
	
	public Notification getOne(Integer id) {
		return notificationRepository.getOne(id);
	}

	public List<Notification> getAll() {
		return notificationRepository.getAll();
	}
	
	private synchronized Integer getId() {
		return currentId.getAndIncrement();
	}

}
