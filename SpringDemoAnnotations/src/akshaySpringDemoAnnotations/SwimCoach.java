package akshaySpringDemoAnnotations;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	//inject properties file values
	@Value("${akshay.email}")
	private String email;
	
	@Value("${akshay.team}")
	private String team;
		
	public SwimCoach(FortuneService theFrotuneService) {
		fortuneService = theFrotuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 100m as a worm Up!!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.theFortuneService();
	}

	//getters for properties values
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
}
