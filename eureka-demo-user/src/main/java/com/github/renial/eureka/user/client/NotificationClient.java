package com.github.renial.eureka.user.client;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.renial.eureka.user.model.Notification;

@FeignClient("http://eureka-demo-notification")
public interface NotificationClient {

	@RequestMapping(value = "/notification/getAll", method = GET)
	List<Notification> getAll();

	@RequestMapping(value = "/notification/getOne", method = GET)
	Notification getOne(@RequestParam("id") Integer id);

}
