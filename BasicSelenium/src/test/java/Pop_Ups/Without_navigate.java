package Pop_Ups;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Without_navigate {
public static void main(String[] args) {
	//create object for ChromeOptions class
    ChromeOptions settings = new ChromeOptions();
			
			//call and pass args addArguments(String ChromiumCommand)
			settings.addArguments("--headless");
			
			//create object for chromedriver class and pass settings reference variable in constructor
			ChromeDriver driver= new ChromeDriver(settings);
			
			//implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			//navigate to url
			driver.get("https://permission.site/");
			
			//print title
			System.out.println(driver.getTitle());
			driver.quit();
			
}
}
