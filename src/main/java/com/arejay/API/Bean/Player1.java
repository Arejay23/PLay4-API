package com.arejay.API.Bean;

import com.github.javafaker.Faker;

public class Player1 {
	
	String name;
	String color;
	String moves="";
	
	public String getMoves() {
		return moves;
	}

	public void setMoves(String moves) {
		this.moves = moves;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Player1() {
		Faker faker = new Faker();
		this.name=faker.name().fullName();
		this.color="Yellow";
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
