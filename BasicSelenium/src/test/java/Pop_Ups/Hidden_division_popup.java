package Pop_Ups;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_division_popup {
public static void main(String[] args) throws InterruptedException {
		
		//launch browser
		ChromeDriver driver= new ChromeDriver();
		
		//maximize
		driver.manage().window().maximize();
		
		//navigate to url
		driver.get("https://demoapps.qspiders.com/ui/datePick?sublist=0");
				
		Thread.sleep(3000);
		
		//identify element
		driver.findElement(By.xpath("//div[contains(@class,'relative flex')]/child::*[name() = 'svg']")).click();
		
		Thread.sleep(3000);
		
		for(;;) {
			try {
				//identify web element and perform click
				driver.findElement(By.xpath("//div[@aria-label='Choose Tuesday, September 15th, 2026']")).click();
			break;
		}
			catch (Exception e) {
			//click on next month button
			driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
}
}
}
}
