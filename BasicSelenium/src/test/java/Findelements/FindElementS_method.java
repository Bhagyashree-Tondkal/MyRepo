package Findelements;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementS_method {
	public static void main(String[] args) throws Exception {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		
		/*
		 //print the text of links
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		//iterate over collection of links
		for(int i=0;i<=links.size()-1;i++) {
			String linktext = links.get(i).getText();
			System.out.println(linktext);	
		}
		//to print links
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		//iterate on the list of links
		for(WebElement element:links) {
		   String linktext = element.getAttribute("href");
	       System.out.println(linktext);
		}
		*/
		//select radio buttons
		List<WebElement> radio_buttons = driver.findElements(By.xpath("//input[@type='radio']"));
		for(WebElement element:radio_buttons) {
			element.click();
			System.out.println(element.isSelected());
		}
		driver.close();
	}

}
