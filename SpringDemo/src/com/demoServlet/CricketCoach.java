package com.demoServlet;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("CricketCoach: In constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: In setterMethod");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Bowling 12 min daily";
	}

	@Override
	public String getDailyFortunre() {
		return fortuneService.getFortune();
	}

}
