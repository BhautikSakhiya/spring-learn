package com.demoServlet;

public class MyApp {

	public static void main(String[] args) {
		
//		String coach = new BaseballCoach().getDailyWorkout();
		Coach coach = new TrackCoach();
		System.out.println(coach.getDailyWorkout());
		
//		new Coach().getDailyWorkout();
	}

}
