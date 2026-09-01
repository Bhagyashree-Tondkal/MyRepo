package manage_methods;

import java.util.Set;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_multiple_windows {

	public static void main(String[] args) throws Exception {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vinothqaacademy.com/multiple-windows/");
		
		String parent= driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.name("newbrowserwindow123")).click();

		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		
		//iterate
		//SWITCH TO CHILD WINDOW
		for(String window :windows ) {
				driver.switchTo().window(window);
				System.out.println(driver.getTitle());
				driver.close();	
		}
		
		//switch back to parent
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
        driver.quit();
	}

}
