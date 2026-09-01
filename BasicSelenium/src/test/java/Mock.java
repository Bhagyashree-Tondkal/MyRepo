import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mock {
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
		
		WebElement ele=driver.findElement(By.xpath("//p[contains(text(),'Dropped!')]"));
		
		System.out.println(ele.getText());	
	}	
}

