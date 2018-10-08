package com.springbbot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbbot.domain.Test;
import com.springbbot.serveice.TestService;

@RestController
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@RequestMapping("/test")
	public String home() {
		return "Hello World!";
	}
	
	
	@RequestMapping("/findAlltest")
	public List<Test> findAllTest() {
		
		List<Test> findAll = testService.findAll();
		
		return findAll;
	}
	
	
}
