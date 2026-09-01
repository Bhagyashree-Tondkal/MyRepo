package Pop_Ups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_window_popup_multiple_sessionid {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		//maximize
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//url
		driver.get("https://demowebshop.tricentis.com/");
		
	//String parentsessionid = driver.getWindowHandle();
		
		//hard wait
		Thread.sleep(9000);
		
		//capture all session ids
		Set<String> allsessionids =driver.getWindowHandles();
		
		for(String string : allsessionids) {
			//transfer the control
			driver.switchTo().window(string);
			
			String currentwindowtitle =driver.getTitle();
			
			if(currentwindowtitle.contains("nopCommerce (@nopCommerce) / X")) {
				break;
			}}
		//hard wait
		Thread.sleep(3000);
		
		//print url
		System.out.println(driver.getCurrentUrl());
				
		//print title
		System.out.println(driver.getTitle());
		
				
		
	}

}

	


