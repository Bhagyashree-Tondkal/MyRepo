package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validations {
	

	public static void main(String[] args) {
		
		/*
	//launch Chrome browser
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	
	//Maximize browser
	driver.manage().window().maximize();
	
	WebElement element= driver.findElement(By.xpath("//input[@class='search-box-text ui-autocomplete-input']"));
	
	

boolean elementbeforeclick =  element.isSelected();
	
	System.out.println(elementbeforeclick);
	
boolean elementafterclick =  element.isEnabled();

	element.click();

	System.out.println(elementafterclick);
	
		//launch Chrome browser
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		
		//Maximize browser
		driver.manage().window().maximize();
		
		WebElement element= driver.findElement(By.xpath("//input[@type='checkbox']"));
		
		boolean elementbeforeclick =  element.isSelected();
		
		System.out.println(elementbeforeclick);
		
	boolean elementafterclick =  element.isEnabled();

		element.click();

		System.out.println(elementafterclick);
		*/
		
		
		
//launch browser
		ChromeDriver driver = new ChromeDriver();
		
		//url
		driver.get("https://demowebshop.tricentis.com/");
		
		//search
		WebElement element = driver.findElement(By.xpath("//input[@id='pollanswers-1']"));
		
		boolean elementbeforeclick = element.isSelected();
		System.out.println(elementbeforeclick);
		
		boolean elementafterclick = element.isEnabled();
		element.click();
		System.out.println(elementafterclick);
			
	}	
	}

