package com.arejay.API.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arejay.API.Bean.User;
import com.arejay.API.dao.UserDao;

@Service
public class UserService {
	@Autowired
	private UserDao dao;
	
	public List<User> getAllUser(){
		return dao.findAll();
	}
	
	public User getUser(String id){
		return dao.findByUid(id);//.orElse(new User("5","Dpnt knpw",987654321));
		
	}
	
	public User updateUser(User u){
		User newUser=dao.findByUid(u.getUid());
		newUser.setName(u.getName());
		newUser.setNumber(u.getNumber());
		return dao.save(newUser);
		
	}
	
	public void deleteUser(String id){
		 dao.deleteByUid(id);
		
	}
	
	
	public User addNewUser(User u){
		return dao.save(u);
	}
	
	

}
