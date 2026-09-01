package Sychronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait {
	public static void main(String[] args) {
		//launch Chrome browser
				ChromeDriver driver = new ChromeDriver();
				
				//Maximize browser
				driver.manage().window().maximize();
				
				//navigate to url
				driver.get("https://demowebshop.tricentis.com/");
				
				//identify web element
				WebElement element = driver.findElement(By.id("Check"));
				
				System.out.println("execution done");
				
				//explicit wait
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				
				//condition
				wait.until(ExpectedConditions.elementToBeClickable(element));
				
				//click
				element.click();
	}
}
