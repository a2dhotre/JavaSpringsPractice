package AkshaySpringDemoFirst;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//add private fields for email address and team
	private String emailAddress;
	private String team;
	
	@Override
	public String getDailyWorkout() {
		return "Practice Fielding for 30 min.";
	}
	
	
	//setter method
	public void setFortuneService(FortuneService fortuneService) {
		
		System.out.println("CricketCoach is inside setter - setFortuneService");
		this.fortuneService = fortuneService;
	}
	
	//getters and setters for added literal values of email address and team name
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach is inside setter - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach is inside setter - setTeam");
		this.team = team;
	}

	//No args constructor
	public CricketCoach() {
	
		System.out.println("CricketCoach is inside default constructor.");
	}
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return (fortuneService.getDailyFortune());
	}

}
