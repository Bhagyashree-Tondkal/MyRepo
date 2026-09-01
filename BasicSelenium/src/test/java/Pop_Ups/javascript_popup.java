package Pop_Ups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript_popup {
	public static void main(String[] args) throws InterruptedException {
		
		//launch Chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize browser
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//navigate to url
		driver.get("https://demowebshop.tricentis.com/");
		
		//identify web element and click
		driver.findElement(By.xpath("//input[@value=\"Search\"]")).click();
		
		//hard wait
		Thread.sleep(3000);
		
		//store alert instance in local variable
		Alert jspopup=driver.switchTo().alert();
		
		//call accept()
		jspopup.accept();
		
		/*
		//navigate to url
		driver.get("https://demoqa.com/alerts");
		
		//identify web element and click
		driver.findElement(By.xpath("//button[@id=\"confirmButton\"]")).click();
		
		//hard wait
		Thread.sleep(3000);
		
		//store alert instance in local variable
		Alert jspopup1 = driver.switchTo().alert();
		
		//call accept
		jspopup1.accept(); //OK
		jspopup1.dismiss(); //Cancel
		jspopup1.sendKeys("zxc"); //prompt
		*/
		
		
		
		
		
		
		
		
	}
}
