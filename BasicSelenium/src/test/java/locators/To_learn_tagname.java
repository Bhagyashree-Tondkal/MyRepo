package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_learn_tagname {

	private static final String List = null;
	

	public static void main(String[] args ) throws InterruptedException {
		
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	
	Thread.sleep(2000);
	
	java.util.List <WebElement> hyperlinks= driver.findElements(By.tagName("a"));
	
	System.out.println(hyperlinks);
	
	for (WebElement webElement : hyperlinks) {
		
		System.out.println(webElement.getText());
		
		Thread.sleep(2000);
	
	}
	}
}
