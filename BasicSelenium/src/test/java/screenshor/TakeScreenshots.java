package screenshor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshots {
	public static void main(String[] args) throws IOException, InterruptedException {
		//create object for ChromeDriver class
		WebDriver driver = new ChromeDriver();
		
		//maximize 
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	
		//navigate to url
		driver.get("https://www.zomato.com/");
		
		//hard wait
		Thread.sleep(2000);
		
		
	   //type cast driver reference into TakesScreenshot reference
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		//call getScreenshotAs()
		File temp=ts.getScreenshotAs(OutputType.FILE);
		
		//create destination file
		File dest = new File("./screenshots/image.png");
		
		//copy paste temp into dest
		FileHandler.copy(temp, dest);
	
		
			/*	
		//identify web element
		WebElement ts = driver.findElement(By.xpath("(//img[@alt='App Download Logo'])[6]"));
		
	    //call getScreenshotAs()
		File temp=ts.getScreenshotAs(OutputType.FILE);
		
		//capture system time 
		String time = LocalDateTime.now().toString().replace(":", "_");
		
		//create destination file
		File  dest = new File("./screenshots/image"+time+".png");
		
		//copy paste temp into dest
		FileHandler.copy(temp, dest);
		
	*/
		
	
	
		
	}
	}
	


