package com.test.service.impl;

import org.springframework.stereotype.Service;

import com.test.service.HelloService;

@Service
public class HelloServiceImpl implements HelloService{

	@Override
	public String sayHello(String str) {
		return "Hello," + str;
	}

}
