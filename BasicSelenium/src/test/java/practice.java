import java.io.File;
import java.util.Set;
import java.util.logging.FileHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
class practice {
	public static void main(String[] args) throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://testautomationpractice.blogspot.com/");
	Actions ac = new Actions(driver);
	
	WebElement element = driver.findElement(By.id("droppable"));
	
	ac.scrollToElement(element).perform();
	
	WebElement src = driver.findElement(By.id("droppable"));
	
	WebElement target = driver.findElement(By.id("droppable"));
	
	Thread.sleep(2000);
	
	ac.dragAndDrop(src, target).build().perform();
	
	
	
	//screenshot
    WebElement element1 = driver.findElement(By.xpath("(//*[local-name()='svg'])[2]"));
    Thread.sleep(2000);
	ac.scrollToElement(element1).build().perform();
	
	File temp = element1.getScreenshotAs(OutputType.FILE);
	
	File dest = new File("./screenshots/green.png");
	
	org.openqa.selenium.io.FileHandler.copy(temp, dest);
	
	//click on pop
	WebElement Popup = driver.findElement(By.id("PopUp"));
	ac.scrollToElement(Popup).click().perform();
	
	String parent= driver.getWindowHandle();
	Thread.sleep(2000);
	
	Set<String> windows = driver.getWindowHandles();
	
	
	for(String window :windows ) {
		driver.switchTo().window(window);
		System.out.println(driver.getTitle());
		
     }
	
	driver.switchTo().window(parent);
	System.out.println(driver.getTitle());
    driver.quit();
	}
}
    
    
    
	       

	    
    
    
	    
	
	
	