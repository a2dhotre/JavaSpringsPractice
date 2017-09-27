package akshaySpringDemoAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		//read the spring config file
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//use of default bean id
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call new methods
		System.out.println(theCoach.getDailyFortune());
		
		//call new added methods to get values loaded from properties file
		System.out.println("email: " + theCoach.getEmail());
		
		System.out.println("Team :" + theCoach.getTeam());
		
		//close the container instance
		context.close();
	}

}
