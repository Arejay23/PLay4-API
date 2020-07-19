package com.arejay.API.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.arejay.API.Bean.User;

@Repository
public interface UserDao extends MongoRepository<User,String>{

	public User findByUid(String id);

	public void deleteByUid(String id);
	

}
