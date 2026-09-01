package Pop_Ups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_popup {
	public static void main(String[] args) throws InterruptedException {
			
		//create object for ChromeOptions class
		ChromeOptions settings = new ChromeOptions();
		
		//call and pass args addArguments(String ChromiumCommand)
		settings.addArguments("--disable-notifications");
		
		//by default maximize browser
		settings.addArguments("--start-maximized");
		settings.addArguments("--start-fullscreen");
		settings.addArguments("--incognito");
		
		//create object for chromedriver class and pass settings reference variable in constructor
		WebDriver driver= new ChromeDriver(settings);
		
		//maximize
		//driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to url
		driver.get("https://permission.site/");
		
		//hard wait
		Thread.sleep(3000);
		
		//find element notification and click
		driver.findElement(By.xpath("//button[@id='notifications']")).click();
	}
}
