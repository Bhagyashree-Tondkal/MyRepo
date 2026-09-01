package LaunchingBrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_multiple {
public static void main(String[] args) throws InterruptedException {
		
		//create object for ChromeDriver class
				WebDriver driver = new ChromeDriver();
				
				//maximize 
				driver.manage().window().maximize();
				
				//implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//navigate to url
				driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
				
				//identify and store web element in local variable
				WebElement CountryCodeDropDown = driver.findElement(By.xpath(""));
				
				//create object for select class
				Select sc = new Select(CountryCodeDropDown);
				
				//select
				sc.selectByValue("//select[@id='select-multiple-native']");
				
				

}
}