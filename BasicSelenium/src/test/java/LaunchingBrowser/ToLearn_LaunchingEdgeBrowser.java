package LaunchingBrowser;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ToLearn_LaunchingEdgeBrowser {

	public static void main(String[] args) throws Exception {
	
		//launch Chrome browser			
		WebDriver driver = new ChromeDriver();
		
		//maximize
		driver.manage().window().maximize();
		
		//minimize
		driver.manage().window().minimize();
		
		//navigate to URL
		driver.get("https://www.google.com/");
		
		//to print title
		System.out.println(driver.getTitle());
		
		//Print currenturl
	    System.out.println(driver.getCurrentUrl());
		
	    //print pagesource
	    //System.out.println(driver.getPageSource());
	    
	    //Navigate to url - method chaining- navigate
	    driver.navigate().to("https://demowebshop.tricentis.com/");
	    
	    driver.navigate().back();
	    Thread.sleep(2000);
	    driver.navigate().forward();
	    driver.navigate().refresh();
		//driver.close();
	    
	    driver.quit();
		
		 
	}

}
