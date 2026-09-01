package Action_class;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Key_up_and_down {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Actions ac = new Actions(driver);
		
		WebElement search= driver.findElement(By.id("small-searchterms"));
		
		ac.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("book").keyUp(Keys.SHIFT).perform();
		

	}

}
