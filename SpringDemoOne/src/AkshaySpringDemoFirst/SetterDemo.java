package AkshaySpringDemoFirst;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemo {

	public static void main(String[] args) {
	
		//load spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrive bean from spring container
		CricketCoach myCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		//call methods on bean
		System.out.println(myCoach.getDailyWorkout());
		
		System.out.println(myCoach.getDailyFortune());
		
		//clall new methods to display literal values injected
		System.out.println(myCoach.getEmailAddress());
		
		System.out.println(myCoach.getTeam());
			
		//close context
		context.close();
	}
}