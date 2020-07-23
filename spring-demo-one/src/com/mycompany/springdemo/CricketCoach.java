package com.mycompany.springdemo;

// uses setter injection
public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String email;
	private String team;
	
	public CricketCoach() {
		System.out.println("Inside Cricket coach default constructor");
	}
	
	// will be used for setter dependency injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside Cricket coach setFortuneService method");
		this.fortuneService = fortuneService;
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("Inside Cricket coach setEmail method");
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Inside Cricket coach setTeam method");
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice fast bowling";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
