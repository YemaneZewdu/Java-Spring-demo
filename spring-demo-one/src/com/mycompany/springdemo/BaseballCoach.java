package com.mycompany.springdemo;

public class BaseballCoach implements Coach{
	
	@Override
	public String getDailyWorkout() {
		
		return "Spend 1hr on batting practice";
	}

	@Override
	public String getDailyFortune() {
		
		return "";
	}
	

}
