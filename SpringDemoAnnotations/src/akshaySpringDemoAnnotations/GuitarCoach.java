package akshaySpringDemoAnnotations;

import org.springframework.beans.factory.annotation.Value;

public class GuitarCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${akshay.email}")
	private String email;
	
	@Value("${akshay.team}")
	private String team;

	public GuitarCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice basic strings";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.theFortuneService();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
}
