package akshaySpringDemoAnnotations;

import org.springframework.stereotype.Component;

@Component("SmartCoach")
public class ChessCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice for 30 min with computer game.";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

}
