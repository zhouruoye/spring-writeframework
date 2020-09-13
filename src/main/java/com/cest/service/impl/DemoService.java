package com.cest.service.impl;


import com.cest.config.annotation.GPService;
import com.cest.service.IDemoService;

/**
 * 核心业务逻辑
 */
@GPService
public class DemoService implements IDemoService {

	public String get(String name) {
		System.out.println("my name is" + name);
		return "My name is " + name;
	}

}
