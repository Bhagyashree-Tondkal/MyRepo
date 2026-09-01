package Sychronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluent_wait {
	public static void main(String[] args) {
		//launch Chrome browser
				WebDriver driver = new ChromeDriver();
				
				//Maximize browser
				driver.manage().window().maximize();
				
				//navigate to url
				driver.get("https://demowebshop.tricentis.com/");
				
				FluentWait wait = new FluentWait<>(driver);
						wait.withTimeout(Duration.ofSeconds(2));
						wait.pollingEvery(Duration.ofSeconds(5));
						wait.ignoring(NoSuchElementException.class);
				
			WebElement ele = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
}
}
