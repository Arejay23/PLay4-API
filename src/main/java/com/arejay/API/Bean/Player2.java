package com.arejay.API.Bean;

import com.github.javafaker.Faker;

public class Player2 {
	String name;
	String color;
	String moves = "";

	public String getMoves() {
		return moves;
	}

	public void setMoves(String moves) {
		this.moves = moves;
	}

	public Player2() {
		Faker faker = new Faker();
		this.name = faker.name().fullName();
		this.color = "Red";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
