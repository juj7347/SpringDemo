package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	Random random = new Random();
	String[] fortune = {"boo", "trash", "loser"};
	
	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}
	
	@Override
	public String randomFortune() {
		return fortune[random.nextInt(3)];
	}
}
