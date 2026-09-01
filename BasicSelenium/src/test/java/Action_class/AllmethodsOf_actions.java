package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AllmethodsOf_actions {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		Actions ac = new Actions(driver);
		
		//move to element computers
		WebElement computers = driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
		ac.moveToElement(computers).build().perform();
		
		//move to desktop
		WebElement desktop = driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[1]"));
		ac.moveToElement(desktop).click().build().perform();
		
		Thread.sleep(3000);
		driver.close();
	}

}
