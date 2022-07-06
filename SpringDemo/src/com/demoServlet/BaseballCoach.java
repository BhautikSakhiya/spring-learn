package com.demoServlet;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortunreService) {
		fortuneService = theFortunreService;
	}
	
	public String getDailyWorkout() {
		return "spend 30 min on batting practice";
	}

	@Override
	public String getDailyFortunre() {
		return fortuneService.getFortune();
	}
}
