package Sychronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit_wait {
	public static void main(String[] args) {
		//launch Chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize browser
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.firstcry.com/");
		
	//  Click on Preschool Admissions
	    driver.findElement(By.xpath("//a[@tabindex='-1' and contains(text(),'Preschool Admissions')]")).click();

	    // Click on Admission Enquiry
	    driver.findElement(By.xpath("//button[@fdprocessedid='pl161']")).click();

	 
	    // Enter Name
	    driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Bhagyashree");

	    // Enter Email
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@gmail.com");

	    // Enter Mobile Number
	    driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9876543210");

	    // Enter City
	    driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Bangalore");

	    // Select Preschool (example dropdown)
	    driver.findElement(By.xpath("//select[@name='preschool']")).sendKeys("EuroKids");

	    // Click Submit button
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	    //  Capture success message
	    WebElement successMsg = driver.findElement(By.xpath("//div[contains(text(),'Thank')]"));

	    // Print success message
	    System.out.println(successMsg.getText());

	    // Close browser
	    driver.quit();
}
}