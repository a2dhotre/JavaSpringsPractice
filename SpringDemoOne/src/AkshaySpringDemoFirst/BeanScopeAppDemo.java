package AkshaySpringDemoFirst;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeAppDemo {

	public static void main(String[] args) {
	
		//Load Spring Configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");
		//Retrieve bean from spring container
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//check if they have same reference
		boolean result = (theCoach == alphaCoach);
		
		//display the results
		System.out.println("\n Pointing to same object is " + result + ".");
		
		System.out.println("Memory loaction for theCoach is :" + theCoach);
		
		System.out.println("Memory loaction for theCoach is :" + alphaCoach);
	
		//close the context
		context.close();
	}
	

}
