package com.arejay.API.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController implements ErrorController{

	@Override
	@RequestMapping(value ="/error")
	public String getErrorPath() {
		return "accessDenied 404 . Please use correct url path";
	}

}
