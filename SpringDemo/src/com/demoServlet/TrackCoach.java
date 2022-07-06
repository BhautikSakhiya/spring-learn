package com.demoServlet;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {}
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run hard 5km";
	}

	public String getDailyFortunre() {
		// TODO Auto-generated method stub
		return "Just do it "+fortuneService.getFortune();
	}
	
	public void doMyStartupStuff() {
		System.out.println("doMyStartupStuff");
	}
	
	public void doMyCleanupStuff() {
		System.out.println("doMyCleanupStuff");
	}

}
