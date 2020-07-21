package com.mycompany.springdemo;

public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Run a long 5k";
	}

	@Override
	public String getDailyFortune() {
	
		return null;
	}

}
