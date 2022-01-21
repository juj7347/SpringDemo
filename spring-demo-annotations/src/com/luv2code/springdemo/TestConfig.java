package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

	// define bean for sad fortune service
	@Bean
	public FortuneService deppressedFortuneService() {
		return new DeppressedFortuneService();
	}
	
	// define bean for swim coach
	// calling bean from above to inject sad fortune service into coach bean
	@Bean
	public Coach lifeCoach() {
		return new LifeCoach(deppressedFortuneService());
	}
	
}
