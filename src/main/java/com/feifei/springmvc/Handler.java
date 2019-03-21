package com.feifei.springmvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.feifei.service.UserService;

@Controller
public class Handler {
	
	@Autowired
	private UserService service;

	@ResponseBody
	@RequestMapping("/test")
	public List<Object> test(){
		List<Object> list=service.getAlluser();
		return list;
	}
}
