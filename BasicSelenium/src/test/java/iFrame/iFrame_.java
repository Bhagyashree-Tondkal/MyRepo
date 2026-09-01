package iFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame_ {
	public static void main(String[] args) throws InterruptedException {
		        //launch Chrome browser
				ChromeDriver driver = new ChromeDriver();
				
				//Maximize browser
				driver.manage().window().maximize();
				
				//implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//navigate to url
				driver.get("https://demoqa.com/frames");
				
				//capture web element in frame
				String frame1text = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
				
				//transfering driver control into frame by name
				driver.switchTo().frame("printwebpagetext");
				
				//print
				//System.out.println(printwebpagetext);
				
				//transfering driver control into frame by name
				driver.switchTo().frame("frame1");
				
				//capture web element in frame
				String s = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
				
				//print
				System.out.println();
				
				driver.switchTo().parentFrame();
				
				//capture web element from main web page
				String webpage2text = driver.findElement(By.xpath("//h1[@class='text-center']")).getText();
				
				//print
				System.out.println(webpage2text);		
	}
}
