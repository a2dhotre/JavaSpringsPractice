package akshaySpringDemoAnnotations;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Random;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	private String fileName = "C:\\Akshay-Data\\Java Springs\\Fortune-data.txt";
	private ArrayList<String> theFortunes;
	
	//random number generator
	private Random myRandom = new Random();
	
	public FileFortuneService() {
	
	File theFile = new File(fileName);
	
	System.out.println("Reading fortunes from file: " + theFile);
	System.out.println("File exists: " + theFile.exists());
	
	// initialize array list
	theFortunes = new ArrayList<String>();
	
	//read from files
	try(BufferedReader br = new BufferedReader(new FileReader(theFile))){
		
		String tempLine;
		
		while((tempLine = br.readLine()) != null) {
			theFortunes.add(tempLine);
		}
		
	} catch (IOException e) {

		e.printStackTrace();
	}
	
	}
	@Override
	public String theFortuneService() {
		
		int index = myRandom.nextInt(theFortunes.size());
		
		String tempFortune = theFortunes.get(index);
		
		return tempFortune;
	}
	
	@PostConstruct
	public void myStartupStuff() {
		System.out.println(theFortunes);
	}
	
	@PreDestroy
	public void myCleanupStuff()
	{
		System.out.println(theFortunes);
	}

}