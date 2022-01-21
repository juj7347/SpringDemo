package com.luv2code.springdemo;

public class LifeCoach implements Coach {

	private FortuneService fortuneService;
	
	public LifeCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Don't do anything";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
