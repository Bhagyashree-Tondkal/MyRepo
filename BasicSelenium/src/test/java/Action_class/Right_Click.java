package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		Thread.sleep(2000);
		Actions ac = new Actions(driver);
          WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));	 
	      ac.contextClick(button).build().perform();
	      
	      WebElement copy=driver.findElement(By.xpath("//span[text() = 'Copy']"));
	      ac.moveToElement(copy).click().build().perform();
	}
}