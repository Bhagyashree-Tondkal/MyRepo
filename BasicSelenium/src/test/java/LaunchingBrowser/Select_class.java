package LaunchingBrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import locators.Webelement;

public class Select_class {
	public static void main(String[] args) throws InterruptedException {
		
		//create object for ChromeDriver class
				WebDriver driver = new ChromeDriver();
				
				//maximize 
				driver.manage().window().maximize();
				
				//implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//navigate to url
				driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
				
				//identify and store web element in local variable
				WebElement CountryCodeDropDown = driver.findElement(By.xpath("select[@id=\"country_code\']"));
				
				//create object for select class
				Select sc = new Select(CountryCodeDropDown);
				
				Thread.sleep(4000);
				
				//select using index
				sc.selectByIndex(1);
				
				//select by value
				sc.selectByValue("+14");
				
				Thread.sleep(4000);
				
				//select by visible text
				sc.selectByVisibleText("+91");
				Thread.sleep(4000);
				
				
				
				
	}

}
