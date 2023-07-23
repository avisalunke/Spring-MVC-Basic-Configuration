package com.mvc.module.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class mycontroller {

	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public String show() {
		return "home";
	}
}
