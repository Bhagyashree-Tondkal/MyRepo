package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import locators.Webelement;

public class Tp {
	public static void main(String[] args) throws Exception {
		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();

		        driver.get("https://www.dezlearn.com/nested-iframes-example/");
		        Thread.sleep(5000);

		        // Switch to outer iframe
		        driver.switchTo().frame("demo_frame1");

		        // Switch to inner iframe
		        driver.switchTo().frame("demo_frame2");

		        // Click the checkbox
		        driver.findElement(By.xpath("//input[@type='checkbox']")).click();

		        Thread.sleep(3000);

		        driver.quit();
		    }
		
		
		
	
	}

