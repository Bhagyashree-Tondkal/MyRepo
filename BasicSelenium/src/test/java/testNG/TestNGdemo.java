package testNG;


import java.awt.desktop.QuitEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
//import org.slf4j.helpers.Reporter;
import org.testng.annotations.Test;

public class TestNGdemo {
	
	         @Test (priority = 10)
	         public void Login() 
	         {
	         Reporter.log("Login",true);
		
	          }
		
		       @Test(priority = 30)
		       public void SearchProduct() 
		        {
	        	Reporter.log("SearchProduct",true);
	          	}
		
		
			@Test (priority = 40,invocationCount = 4,threadPoolSize = 4,enabled = false)
			public void AddToCart() throws InterruptedException 
		{
				WebDriver driver = new ChromeDriver();
				Thread.sleep(3000);
				
				driver.quit();

		}
			
			@Test(priority = 60)
			public void Logout() 
		{
			Reporter.log("Logout",true);
		}
}
