package Action_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_suggestion {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
	
		List<WebElement> suggestions = driver.findElements(By.name("q"));
		
		for(WebElement suggestion:suggestions) {
			String text=suggestion.getText();
			System.out.println(text);
		
			if (text.equalsIgnoreCase("puma slippers")) {
		        suggestion.click();
		        break;
			}
		}
	}
		
	}


