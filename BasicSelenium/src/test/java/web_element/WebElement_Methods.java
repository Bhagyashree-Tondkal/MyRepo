package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Methods {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		//driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
		
		//getText()
		String text = driver.findElement(By.linkText("Log in")).getText();
		System.out.println(text);
		
		
		
		
		driver.close();
		
	}

}
