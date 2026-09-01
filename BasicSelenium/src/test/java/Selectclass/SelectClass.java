package Selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Books")).click();
		
		WebElement sort = driver.findElement(By.id("products-orderby"));
		Select sc = new Select(sort);
		//select by visible text
		sc.selectByVisibleText("Price: Low to High");
		
		//select by index
		WebElement Display = driver.findElement(By.id("products-pagesize"));
		Select sc1 = new Select(Display);
		sc1.selectByIndex(2);
		
		Thread.sleep(2000);

		WebElement View  = driver.findElement(By.id("products-viewmode"));
		Select sc2 = new Select(View);
		sc2.selectByVisibleText("List");
		
		
		
		
		
	
		
		
		
		
	
		driver.close();
	}

}
