package com.luv2code.springdemo;

public class DeppressedFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Stay Home";
	}

}
