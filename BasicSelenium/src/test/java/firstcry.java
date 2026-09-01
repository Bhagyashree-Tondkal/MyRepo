import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstcry {
	public static void main(String[] args) throws InterruptedException { 
		
	
	//launch Chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize browser
		driver.manage().window().maximize();
		
		driver.get("https://www.firstcry.com/");
		
		Thread.sleep(3000);

	    //  Click on Preschool Admissions
	    driver.findElement(By.xpath("//a[@tabindex='-1' and contains(text(),'Preschool Admissions')]")).click();

	    

	    // Click on Admission Enquiry
	    driver.findElement(By.xpath("//div[@class='mid-button-wrappers']/child::button[text()='Admission Enquiry']")).click();

	    
	 // Enter Name
	    driver.findElement(By.xpath("//input[@id='parentName']")).sendKeys("Bhagyashree");

	    // Enter Mobile Number
	    driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9876543210");

	    // Enter City
	    driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Bangalore");

	    // Select Preschool (example dropdown)
	    driver.findElement(By.xpath("//select[@name='preschool']")).sendKeys("EuroKids");

	    Thread.sleep(2000);

	    // Click Submit button
	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    Thread.sleep(3000);

	    //  Capture success message
	    WebElement successMsg = driver.findElement(By.xpath("//div[contains(text(),'Thank')]"));

	    // Print success message
	    System.out.println(successMsg.getText());

	    // Close browser
	    driver.quit();
	}
}
