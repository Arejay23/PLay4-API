package com.arejay.API.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arejay.API.Bean.Board;
import com.arejay.API.service.PlayService;

@RestController
public class PlayController {
	@Autowired
	PlayService playService;
	
	@RequestMapping(value = "/play4/START")
	public  String getNews() throws Exception{
		//reset the params and initialise the param and Board to start
		return playService.initBoard();
	}
	
	@RequestMapping(value = "/play4/Player1/{col}")
	public  String getPlayer1(@PathVariable int col) throws Exception{
		//reset the params and initialise the param to start
		return playService.validateMoveP1(col);
	}
	
	@RequestMapping(value = "/play4/Player2/{col}")
	public  String getPlayer2(@PathVariable int col) throws Exception{
		//reset the params and initialise the param to start
		return playService.validateMoveP2(col);
	}
	
	@RequestMapping(value = "/play4/chooseColor/{color}")
	public  String getPlayer2(@PathVariable String color) throws Exception{
		//reset the params and initialise the param to start
		return playService.setPlayersColor(color);
	}
	

}
