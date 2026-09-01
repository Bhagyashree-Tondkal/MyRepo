package TP_Advance_selenium;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class To_read {
	public static void main(String[] args) throws Exception {
    FileInputStream fis = new FileInputStream("C:\\Users\\manik\\OneDrive\\Desktop\\data.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String BROWSER = prop.getProperty("browser");
		String URL = prop.getProperty("url");
		String USERNAME = prop.getProperty("user_name");
		String PASSWORD = prop.getProperty("Password");
		String ORGANIZATION_NAME = prop.getProperty("accountname");
		
		
		WebDriver driver = null;
		
		if(BROWSER.equals("firefox"))  {
			driver=new FirefoxDriver();	
		}
		else if(BROWSER.equals("edge")) {
			driver=new EdgeDriver();
		}
		else if(BROWSER.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else {
			driver=new ChromeDriver();
		}
		
		driver.get(URL);
		Thread.sleep(2000);
		//driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		Thread.sleep(2000);
		//driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		Thread.sleep(2000);
		driver.findElement(By.id("submitButton")).click();
		
		WebElement element = driver.findElement(By.xpath("//td[contains(text(),' Organization Information')]ss"));
		System.out.println(element.getText());
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Organizations")).click();
        driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
        driver.findElement(By.name("accountname")).sendKeys(ORGANIZATION_NAME);
        driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
        
       
        
   
        

       

        driver.close();
		
	}

}
