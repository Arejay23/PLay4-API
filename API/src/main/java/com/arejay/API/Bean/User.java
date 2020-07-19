package com.arejay.API.Bean;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User")
public class User {
	@Id
	private ObjectId _id;
	private String uid;
	private String name;
	private int number;
	
	public User() {
	}
	
	public User(String id, String name, int number) {
		this.uid = id;
		this.name = name;
		this.number = number;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String id) {
		this.uid = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
}
