package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RehabCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Internally rotate your shoulders";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
