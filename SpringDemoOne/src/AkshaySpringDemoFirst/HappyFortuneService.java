package AkshaySpringDemoFirst;

public class HappyFortuneService implements FortuneService {
	
	@Override
	public String getDailyFortune() {
		int a = 0;
		a = (int) (Math.random() * (5));
		
		//fortune selector
		switch(a) {
		case 0:
			return "Today you will eat your favourite thing!!";
		case 1:
			return "Today you will gain mony from random sources!!";
		case 2:
			return "Today is your lucky day!!";
		case 3:
			return "Today you will get appriciation!!";
		default:
			return "Be happy!!";	
		}
	}
	

}
