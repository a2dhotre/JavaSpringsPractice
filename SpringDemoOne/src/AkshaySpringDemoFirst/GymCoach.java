package AkshaySpringDemoFirst;

public class GymCoach implements Coach {

	private FortuneService fortuneService;
	
	public GymCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Do 3 sets of Front Raises";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getDailyFortune();
	}

}
