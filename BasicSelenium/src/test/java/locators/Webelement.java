package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		/*driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(3000);
		
	driver.findElement(By.xpath("//input[@value='Search store']")).sendKeys("electronics");*/
		
		
//driver.get("https://flipkart.com/");
		
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//div[text()='2 Wheelers']")).click();
		
		
		driver.get("https://demowebshop.tricentis.com/");
		
		/*driver.findElement(By.xpath("//input[contains(@id,'small-searchterms')]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Jewelry')]")).click();
		*/
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='radio' and @name='pollanswers-1']")).click();
		
		
	}
}
