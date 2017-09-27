package akshaySpringDemoAnnotations;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("akshaySpringDemoAnnotations")
@PropertySource("classpath:sport.properties")
public class SportConfig {

	//define bean for sadFortuneService
	@Bean
	public FortuneService freshFortuneService() {
		return new FreshFortuneService();
	}
	
	//define bean for swim coach and inject dependency
	@Bean
	public Coach guitarCoach() {
		return new GuitarCoach(freshFortuneService());
	}
}
