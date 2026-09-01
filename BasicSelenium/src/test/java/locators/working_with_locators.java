package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class working_with_locators {
	public static void main(String[] args) throws InterruptedException {
		//launch browser
		WebDriver driver=new ChromeDriver();
		
		//navigate to url
		driver.get("https://demowebshop.tricentis.com/");
		
		//click on register link
		driver.findElement(By.linkText("Register")).click();
		
		//select radio button
		driver.findElement(By.id("gender-female")).click();
		
		//enter name in firstname textfield
		driver.findElement(By.className("text-box")).sendKeys("divya");
		
		//enter name in last name textfield
		driver.findElement(By.id("LastName")).sendKeys("xyz");
		
		//enter email
		driver.findElement(By.id("Email")).sendKeys("zxc123@gmail.com");
		
		//enter password
		driver.findElement(By.name("Password")).sendKeys("zxcvbnm123");
		
		//confirm password
		driver.findElement(By.name("ConfirmPassword")).sendKeys("zxcvbnm123");
		
		//click on register button
		driver.findElement(By.id("register-button")).click();
		
		//wait for 5 sec
		Thread.sleep(5000);
		
		//close 
		driver.close();
	}
}
