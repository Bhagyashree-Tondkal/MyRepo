package Action_class;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling {
	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Actions ac = new Actions(driver);
		
		WebElement news = driver.findElement(By.linkText("News"));
		//ac.scrollByAmount(0, 1000).perform();
		ac.scrollToElement(news).click().perform();
		
	}
}
		