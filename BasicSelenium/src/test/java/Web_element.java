import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_element {
	public static void main(String[] args) throws InterruptedException {
	
	//launch Chrome browser
	ChromeDriver driver = new ChromeDriver();
		
		//Maximize browser
		driver.manage().window().maximize();
		
		//Navigate to application
		driver.get("https://demowebshop.tricentis.com/");
		
		//click on login link
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		//click on forgot password
		driver.findElement(By.xpath("//span[@class='forgot-password']")).click();
		
		//enter usename in user name textfield
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("bhagya@gmail.com");
		
		/*
		//hard wait
		Thread.sleep(2000);
		
		//clear
		driver.findElement(By.xpath("//input[@id='Email']")).clear();
		
		//hard wait
		Thread.sleep(2000);
		
		//re enter
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("bhagya@gmail.com");
		
		//enter password in password text field
		driver.findElement(By.xpath("//input[@id = 'Password']")).sendKeys("zxcv@123");
		
		//click on login button
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).submit();	
		*/
	}
}
