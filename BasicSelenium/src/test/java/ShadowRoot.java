import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShadowRoot {
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Open Shadow
		/*
		driver.get("https://demoapps.qspiders.com/ui/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[contains(text(),'Shadow')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//section[contains(text(),'Shadow')])[2]")).click();
		Thread.sleep(2000);
		
		//identify shadowroot
		SearchContext shadow_root = driver.findElement(By.xpath("//form/div[1]")).getShadowRoot();
		Thread.sleep(2000);
		
		shadow_root.findElement(By.cssSelector("input[type='text']")).sendKeys("divya");
		Thread.sleep(2000);
		driver.close();
		*/
		
		//Close shadow
		driver.get("https://demoapps.qspiders.com/ui/shadow/closed?sublist=1");
		Thread.sleep(4000);
		
		//login attached text
		driver.findElement(By.xpath("//h1[text()='Login']")).click();
		Thread.sleep(2000);

		//create actions class
		Actions ac = new Actions(driver);
		Thread.sleep(2000);
		
		ac.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		
		ac.sendKeys("divya").perform();
		Thread.sleep(2000);
		
		ac.sendKeys(Keys.TAB).perform();
		ac.sendKeys("123").perform();
		
		
		Thread.sleep(2000);
         driver.close();
		
		
	}

}
