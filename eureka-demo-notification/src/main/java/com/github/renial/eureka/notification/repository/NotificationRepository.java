package com.github.renial.eureka.notification.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.github.renial.eureka.notification.model.Notification;

@Repository
public class NotificationRepository {
	
	private List<Notification> notifications = new ArrayList<>();
	
	public void create(Notification notification) {
		notifications.add(notification);
	}
	
	public List<Notification> getAll() {
		return notifications;
	}

}
