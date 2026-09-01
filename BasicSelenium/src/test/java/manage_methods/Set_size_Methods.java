package manage_methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_size_Methods {

	public static void main(String[] args) throws InterruptedException {
		//create object for chromebrowser class
		ChromeDriver driver=new ChromeDriver();
		
		//hard wait
		Thread.sleep(3000);
		
		//Create object for point class
		Point point = new Point(-5,5);
		
		//call setsize()
		driver.manage().window().setPosition(point);
		
		
		//hard wait
		Thread.sleep(3000);
		
		//direct approach
		driver.manage().window().setPosition(new Point(400,400));
		
	}

}
