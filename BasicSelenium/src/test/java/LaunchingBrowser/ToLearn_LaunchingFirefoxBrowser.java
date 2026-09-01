package LaunchingBrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ToLearn_LaunchingFirefoxBrowser {

	public static void main(String[] args) {
		
		//launch Firefox browser
		//create object for FirefoxDriver class
				
	FirefoxDriver driver = new FirefoxDriver();
	
	//navigate to URL
	
	driver.get("https://www.instagram.com");

	
	driver.close();
	}

}
