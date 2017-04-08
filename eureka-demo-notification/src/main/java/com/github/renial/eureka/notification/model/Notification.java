package com.github.renial.eureka.notification.model;

import java.util.Date;

public class Notification {

	private String id;
	private Date time;

	public Notification() {
		super();
	}

	public Notification(String id, Date time) {
		super();
		this.id = id;
		this.time = time;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

}
