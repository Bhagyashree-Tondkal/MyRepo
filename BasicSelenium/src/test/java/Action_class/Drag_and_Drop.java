package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://codepen.io/EpsilonDeltaCriterion/full/jLoPgE");
		
		Thread.sleep(2000);
		Actions ac = new Actions(driver);
		Thread.sleep(2000);

		//source element
		 WebElement source = driver.findElement(By.xpath("(//div[text()='Washington'])[2]"));
			Thread.sleep(2000);

		//target element
		 WebElement target = driver.findElement(By.xpath("//div[contains(text(),'United States')]"));
			Thread.sleep(2000);

		ac.dragAndDrop(source, target).build().perform();
		
	}

}
