package JavaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.asm.Advice.Argument;

public class Scrolling_By_To {
	public static void main(String[] args) throws InterruptedException {
		        //launch browser
				ChromeDriver driver = new ChromeDriver();
				
				//maxi
				driver.manage().window().maximize();
				
				//implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//naviagte 
				driver.get("https://www.amazon.com/");
				
				Thread.sleep(3000);
				
				//typecast the webdriver reference into javascript excecuter reference
				JavascriptExecutor js = (JavascriptExecutor) driver;
			
				
				//find element search box
				WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
				WebElement serachbutton=driver.findElement(By.xpath("//input[@type='submit']"));
				
				//enter value in search box
				js.executeScript("arguments[0].value ='iphone'",searchbox);
				
				//click on search button
				js.executeScript("arguments[0].click()",serachbutton);
				
                 js.executeScript("window.scrollBy(0,1500)");
				
				Thread.sleep(3000);
				
				//scroll down by pixels
				js.executeScript("window.scrollTo(0,1000)");
			    
				//scroll bottom
				js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
				
				Thread.sleep(3000);
				
				//scroll up 
				js.executeScript("window.scrollTo(0,0)");
				
	}

}
