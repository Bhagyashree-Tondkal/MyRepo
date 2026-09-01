package Pop_Ups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_window_popup {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		//maximize
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//url
		driver.get("https://demowebshop.tricentis.com/");
		
		String parentsessionid = driver.getWindowHandle();
		
		//hard wait
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
		//click facebook link
		driver.findElement(By.xpath("//a[@href='http://www.facebook.com/nopCommerce']")).click();
		
		//capture all session ids
		Set<String> allsessionids =driver.getWindowHandles();
		
		for(String string : allsessionids) {
			if(!string.equals(parentsessionid)) {
				driver.switchTo().window(string);
				break;
			}
		}
		Thread.sleep(3000);
		
		//print url
		System.out.println(driver.getCurrentUrl());
		
		//print title
		System.out.println(driver.getTitle());
		
		//close child window
		driver.close();
		
		driver.switchTo().window(parentsessionid);
		
		Thread.sleep(3000);
		//print url
		System.out.println(driver.getCurrentUrl());
				
		//print title
		System.out.println(driver.getTitle());
				
		driver.quit();
	}

}
