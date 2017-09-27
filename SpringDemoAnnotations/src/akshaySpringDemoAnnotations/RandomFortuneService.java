package akshaySpringDemoAnnotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//create array of strings
	private String[] data = {
			"Today you will get apprciation!",
			"Today you will learn something new!",
			"Today you will get some reward for your work!"
	};
	//create randon number generator
	private Random 	myRandom = new Random();
	
	@Override
	public String theFortuneService() {

		//pick from random fortune
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		//return the fortune
		return theFortune;
	}

}
