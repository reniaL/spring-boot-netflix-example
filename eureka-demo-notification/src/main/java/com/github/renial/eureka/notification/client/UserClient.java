package com.github.renial.eureka.notification.client;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.renial.eureka.notification.model.User;

@FeignClient("http://eureka-demo-user")
public interface UserClient {
	
	@RequestMapping(value="/user/getOne", method=RequestMethod.GET)
	public User getOne(@RequestParam("id") Integer id);
	
	@RequestMapping(value="/user/getAll", method=RequestMethod.GET)
	public List<User> getAll();
	
}
