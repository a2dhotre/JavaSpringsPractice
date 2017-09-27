package akshaySpringDemoAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		//read the spring config file
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//retrieve bean from container
		Coach theCoach1 = context.getBean("SmartCoach", Coach.class);
		//use of default bean id
		Coach theCoach2 = context.getBean("tennisCoach", Coach.class);
		
		//call methods on the bean
		System.out.println(theCoach1.getDailyWorkout());
		System.out.println(theCoach2.getDailyWorkout());
		
		//call new methods
		System.out.println(theCoach2.getDailyFortune());
		
		//close the container instance
		context.close();
	}

}
