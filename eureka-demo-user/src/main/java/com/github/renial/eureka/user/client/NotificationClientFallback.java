package com.github.renial.eureka.user.client;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.github.renial.eureka.user.model.Notification;

@Service
public class NotificationClientFallback implements NotificationClient {
	
	private static final Log log = LogFactory.getLog(NotificationClientFallback.class);
	
	@Override
	public List<Notification> getAll() {
		log.info("got fallback~");
		return new ArrayList<>();
	}
	
	@Override
	public Notification getOne(Integer id, Boolean wait) {
		log.info("got fallback for: " + id);
		return new Notification(-1, new Date());
	}
	
}
