package navigate;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearn_navigation {

	public static void main(String[] args) throws InterruptedException, MalformedURLException{
		
		//create object for chomeDriver class
	    ChromeDriver driver = new ChromeDriver();
	    
	    //maximize browser
	    driver.manage().window().maximize();
	    
	    //navigate to url using to(URL url)
	    @SuppressWarnings("deprecation")
		URL url =new URL("https://www.Instagram.com");
	    driver.navigate().to(url);
	    driver.navigate().to("https://www.Instagram.com");
	    
	  //navigate to URL
	  driver.get("https://www.Instagram.com");
	  
	  //hard wait
	  Thread.sleep(2000);
	  
	  //back operation
	  driver.navigate().back();
	  
	//hard wait
	  Thread.sleep(2000);
	  
	//forward operation
	  driver.navigate().forward();	
	  
	  //hard wait
	  Thread.sleep(2000);
	  
	//refresh  operation
	  driver.navigate().refresh();	
	}

}
