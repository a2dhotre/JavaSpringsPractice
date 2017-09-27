package akshaySpringDemoAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {

		//define spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrive bean from container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach otherCoach = context.getBean("tennisCoach", Coach.class);
		
		//check if they are same
		boolean result = (theCoach == otherCoach);
		
		//print the results
		System.out.println("Pointing to the same object - " + result);
		System.out.println(theCoach);
		System.out.println(otherCoach);
		
		//close context
		context.close();
	}

}
