package JavaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class execute_Script {


	public static void main(String[] args) throws InterruptedException {
		//launch Chrome browser
		
		
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize browser
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to url
		driver.get("https://demoapps.qspiders.com/ui");
		
		//hard wait
		Thread.sleep(3000);
		
		//typecast the webdriver reference into javascript excecuter reference
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		
		//hard wait
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("//input[@id='name']"));
		
		js.executeScript("arguments[0].click();",element);
		js.executeScript("arguments[0].value ='Hello world'", element);
		js.executeScript("window.scrollBy(0,500);");	
	}
}
