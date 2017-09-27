package akshaySpringDemoAnnotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String theFortuneService() {
		return "Today is your lucky Day!!";
	}

}
