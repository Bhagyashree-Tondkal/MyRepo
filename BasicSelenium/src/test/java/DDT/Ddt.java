package DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ddt {
	@Test
	public void demo() throws IOException {
		
		//step 1: create object for fileinputstream class
		FileInputStream fis = new FileInputStream("./src/test/resources/commondata.properties");
		
		//step 2: create object for properties class
		Properties prop =new Properties();
		
		//step 3: call load() and pass fis reference
		prop.load(fis);
		
		//step 4: read data with the help of getProperty() | call getproperty and pass key
		String URL = prop.getProperty("url");
		
		//printt
		Reporter.log(URL,true);
		
		String USERNAME = prop.getProperty("username");
		Reporter.log(USERNAME,true);
		
		String PASSWORD = prop.getProperty("password");
		Reporter.log(PASSWORD,true);
		
		//create object for chromeDriver class
		WebDriver driver=new ChromeDriver();
		
		//max
		driver.manage().window().maximize();
		
		//implicit
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to url
		driver.get(URL);
		
		//find element gender and click on female
		driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		
		//send keys to first name
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(USERNAME);
		
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("is");
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("zzxcvbnm@gmail.com");
	}
}
