package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sendkeys {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Actions ac = new Actions(driver);
		
		WebElement search= driver.findElement(By.id("small-searchterms"));
		ac.moveToElement(search).click().sendKeys("mobiles").build().perform();
		
	}
	

}
