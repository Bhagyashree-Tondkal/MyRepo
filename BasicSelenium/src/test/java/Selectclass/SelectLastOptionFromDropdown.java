package Selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectLastOptionFromDropdown {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/books");
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='products-orderby']"));
		
		Select sc=new Select(dropdown);
		int lastindex = sc.getOptions().size() -1;
		
		sc.selectByIndex(lastindex);
		
		String lastoption = sc.getFirstSelectedOption().getText();
		
		System.out.println(lastoption);
		
		
	}

}
