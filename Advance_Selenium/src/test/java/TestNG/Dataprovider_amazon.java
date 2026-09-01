package TestNG;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_amazon {
	@Test(dataProvider = "getdata")
	public void price(String brandname, String productname) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(brandname,Keys.ENTER);
		
		String x="//span[contains(text(),'"+productname+"')]/../../../../div[4]/div[1]/div/div[1]/div/div[1]/a/span[1]/span[2]/span[2]";
		
		String price = driver.findElement(By.xpath(x)).getText();
		System.out.println(price);
		driver.close();
	}
	@DataProvider
	public Object[][] getdata() throws Exception{
		
		Object[][] obj= new Object[2][2];
		
		obj[0][0]="iphone";
		obj[0][1]="Apple iPhone 17 Pro Max, US Version, 256GB, eSIM, Cosmic Orange- Unlocked (Renewed)";
		
		obj[1][0]="iphone";
		obj[1][1]="iPhone 16 Silicone Case with MagSafe and Camera Control: Lightweight Phone Case, Wireless Charging Compatible, Smooth Matte Finish; Fuchsia";
		
		return obj;	
	}
}
