package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_and_Hold {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		
		Actions ac = new Actions(driver);
		WebElement click=driver.findElement(By.id("circle"));
		ac.clickAndHold(click);
		Thread.sleep(3000);
       
        
         driver.close();
	
	}

}
