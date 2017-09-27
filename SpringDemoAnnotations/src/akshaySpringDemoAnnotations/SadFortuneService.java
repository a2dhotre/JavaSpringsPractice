package akshaySpringDemoAnnotations;

public class SadFortuneService implements FortuneService {

	@Override
	public String theFortuneService() {
		return "Today you will be facing some trouble but be positive, as something good is bound to happen.";
	}

}
