package com.mycompany.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public TrackCoach() {
		
	}

	@Override
	public String getDailyWorkout() {
		
		return "Run a long 5k";
	}

	@Override
	public String getDailyFortune() {
	
		return "Just Do It: " + fortuneService.getFortune();
	}
	
	// add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff ");
	}
	
	// add a destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside method doMyCleanupStuff ");
	}
	
}
