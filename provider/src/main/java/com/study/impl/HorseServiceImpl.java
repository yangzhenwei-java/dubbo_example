package com.study.impl;

import com.study.service.AnimalService;

public class HorseServiceImpl implements AnimalService {

	@Override
	public String eat() {
		
		System.out.println("吃草....");
		
		return "关于马儿的服务调用了";
	}

}
