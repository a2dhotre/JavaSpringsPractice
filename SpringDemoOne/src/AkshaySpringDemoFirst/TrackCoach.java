package AkshaySpringDemoFirst;

public class TrackCoach implements Coach {

	//Define a private dependency
	private FortuneService fortuneService;
	
	//Define a constructor for dependency injection
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run 5 km.";
	}

	@Override
	public String getDailyFortune() {
		// use my fortune service to get fortune
		
		return fortuneService.getDailyFortune();
	}

	//define custom init method which is public void
	public void myStartupStuff() {
		System.out.println("TrackCOach is in myStartupStuff method.");
	}
	//define custom destroy method which is public void
	public void myCleanupStuff() {
		System.out.println("TrackCOach is in myCleanupStuff method.");
	}
}
