package com.github.renial.eureka.notification.repository;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.github.renial.eureka.notification.model.Notification;

@Repository
public class NotificationRepository {
	
	private Map<Integer, Notification> notificationMap = new LinkedHashMap<>();
	
	public void create(Notification notification) {
		notificationMap.put(notification.getId(), notification);
	}
	
	public Notification getOne(Integer id) {
		return notificationMap.get(id);
	}
	
	public List<Notification> getAll() {
		return new ArrayList<>(notificationMap.values());
	}

}
