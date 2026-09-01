package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException{
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("http://localhost:8888/");
		
		WebElement e =driver.findElement(By.name("user_name"));
		WebElement e1=driver.findElement(By.name("user_password"));
		WebElement e2=driver.findElement(By.id("submitButton"));
		
		e.sendKeys("admin");
		e1.sendKeys("admin");
		
		driver.navigate().refresh();
		
		e.sendKeys("admin");
		e1.sendKeys("admin");
	    e2.click();
	}	
}