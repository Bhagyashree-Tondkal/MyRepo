package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Indirectlocators {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		//CSSSELECTOR
		/*
		driver.findElement(By.cssSelector(".search-box-text.ui-autocomplete-input")).sendKeys("books");
		
		driver.findElement(By.cssSelector(".button-1.search-box-button")).submit();
		
		//XPATH
		//xpath by attributes
         driver.findElement(By.xpath("//input[@id='pollanswers-1']")).click();	
         
         //xpath by indexing-index in []- group the entire expression in () -starts from-1
         driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("computers");
         
        //xpath by text
         driver.findElement(By.xpath("//a[text()='Register']")).click();
         
         //xpath by contains
         driver.findElement(By.xpath("(//a[contains(text(),'Books')])[3]")).click();
         driver.findElement(By.xpath("//input[@class='search-box-text ui-autocomplete-input']")).sendKeys("books");
		
         //starts-with atrribute name 
		driver.findElement(By.xpath("//input[starts-with(@value,'Subs')]")).click();
		
		//starts-with text
        driver.findElement(By.xpath("(//a[starts-with(text(),'Boo')])[1]")).click();
        
        //Ends-with method in xpath
        driver.findElement(By.xpath("//li[ends-with(@type='ext')]")).click();
		
        //xpath with multiple attributes
        driver.findElement(By.xpath("//input[@type='text' and @name='q']")).sendKeys("mobile");
		
		*/
		//xpath by axes
		driver.findElement(By.xpath("//input[@id='pollanswers-1']/following-sibling::input")).click();
	
		 Thread.sleep(3000);
		 driver.close();

	}

}
