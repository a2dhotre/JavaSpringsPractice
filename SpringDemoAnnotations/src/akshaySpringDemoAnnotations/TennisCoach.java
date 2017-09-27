package akshaySpringDemoAnnotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
	
	//define default constructor
	public TennisCoach() {
		System.out.println("TennisCoach is inside default constructor.");
	}
	
	//define custom init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("Tennis Coach is inside custom Init method.");
	}
	
	//define custom destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("Tennis Coach is inside cleanup method.");
	}
	
	/*
	//define setter method
	@Autowired	
	public void anyMethod(FortuneService fortuneService) {
		System.out.println("TennisCoach is inside anyMethod.");
		this.fortuneService = fortuneService;
	}
	*/
	
	/*
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/

	@Override
	public String getDailyWorkout() {
		return "Practice in court for 30 min.";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.theFortuneService();
	}
}
