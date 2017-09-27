package AkshaySpringDemoFirst;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
	
		//Load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach newCoach = context.getBean("myCoach", Coach.class);
		//Call methods on bean
		System.out.println(theCoach);
		System.out.println(newCoach);
		
		//Call new method
		System.out.println(theCoach.getDailyFortune());
		System.out.println(newCoach.getDailyFortune());
		//Close the context
		context.close();
	}

}