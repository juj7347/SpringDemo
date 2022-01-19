package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	Random random = new Random();
	String[] fortune = {"boo", "trash", "loser"};
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String randomFortune() {
		return fortune[random.nextInt(3)];
	}

}
