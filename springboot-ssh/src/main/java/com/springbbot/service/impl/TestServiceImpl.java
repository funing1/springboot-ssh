package com.springbbot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbbot.dao.TestRepository;
import com.springbbot.domain.Test;
import com.springbbot.serveice.TestService;

@Service
public class TestServiceImpl implements TestService {
	
	@Autowired
	private TestRepository testRepository;

	@Override
	public List<Test> findAll() {
		
		 List<Test> findAll = testRepository.findAll();
		
		return findAll;
	}

}
