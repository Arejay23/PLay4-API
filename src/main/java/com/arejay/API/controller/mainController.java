package com.arejay.API.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.arejay.API.Bean.User;
import com.arejay.API.service.UserService;

@RestController
public class mainController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/data" , method=RequestMethod.GET)
	public @ResponseBody List<User> getData() {
		return  userService.getAllUser();
	}
	
	@RequestMapping(value="/data/{id}" , method=RequestMethod.GET)
	public @ResponseBody User getData(@PathVariable String id) {
		System.out.println(id);
		return  userService.getUser(id);
	}
	
	@RequestMapping(value="/data" , method=RequestMethod.POST)
	public @ResponseBody User updateData(@RequestBody User u) {
		return  userService.updateUser(u);
	}
	
	@RequestMapping(value="/data" , method=RequestMethod.PUT)
	public @ResponseBody User addData(@RequestBody User u) {
		return  userService.addNewUser(u);
	}
	
	@RequestMapping(value="/data/{id}" , method=RequestMethod.DELETE)
	public @ResponseBody String deleteData(@PathVariable String id) {
		userService.deleteUser(id);
		return  "Delete successfull";
	}
	
	
}
