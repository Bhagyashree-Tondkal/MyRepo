package Pop_Ups;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class authuntication_popup {

	public static void main(String[] args) throws InterruptedException {
		//launch Chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize browser
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//navigate to url
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
}
}