package com.github.renial.eureka.user.model;

import java.util.Date;

public class Notification {

	private Integer id;
	private Date time;

	public Notification() {
		super();
	}

	public Notification(Integer id, Date time) {
		super();
		this.id = id;
		this.time = time;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

}
