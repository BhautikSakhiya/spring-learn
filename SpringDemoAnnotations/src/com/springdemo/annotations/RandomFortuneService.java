package com.springdemo.annotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	String[] data = {
		"Dell",
		"Lenovo",
		"Acer"
	};
	
	private Random random = new Random();
	
	@Override
	public String getFortune() {
		
		int index = random.nextInt(data.length);
		String theFortune = data[index];
		return theFortune;
	}

}
