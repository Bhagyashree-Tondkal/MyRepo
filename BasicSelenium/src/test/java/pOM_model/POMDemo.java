package pOM_model;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class POMDemo {
	
	@Test
	public void test() throws IOException{
		
		//create object for fileinputstream and pass file path
		FileInputStream fis = new FileInputStream("./src/test/resources/commondata.properties");
		
		//create object for properties class
		Properties prop = new Properties();
		
		//call load() and pass fis
		prop.load(fis);
		
		//call getProperty() and pass key
		String URL = prop.getProperty("url");
		String USERNAME = prop.getProperty("username");
		String PASSWORD = prop.getProperty("password");
		
		//create object for ChromeDriver class
		WebDriver driver = new ChromeDriver();
		
		//maximize
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to url
		driver.get(URL);
		
		//USE POM CLASS OBJECTS TO ACCESS THE WEB ELEMENT
		
		//create object for POM class(LoginPage)
		
		
	}

}
