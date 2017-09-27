package AkshaySpringDemoFirst;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleAppDemo {

	public static void main(String[] args) {
	
		//Load Spring Configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanLifeCycleApplicationContext.xml");
		//Retrieve bean from spring container
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());	
		
		//close the context
		context.close();
	}
	

}
