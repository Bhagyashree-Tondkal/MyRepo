package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign {
	private static final char[] Position = null;

	public static void main(String[] args) throws InterruptedException {
		
    //launch Chrome browser
	ChromeDriver driver = new ChromeDriver();
	
	//Maximize browser
	driver.manage().window().maximize();
	
	/*
	//	Navigate to application
	driver.get ("https://www.Facebook.com");
	
	Thread.sleep(2000);
	
	/*
	//	Capture the title and print
    String title = driver.getTitle();
	System.out.println(title);
	
	//	Capture the url and print
	String URL = driver.getCurrentUrl();
    System.out.println(URL);
    
	//	Capture source code of the application and print
	String Sourcecode = driver.getPageSource();
	System.out.println(Sourcecode);
	
	
	//Capture and print the size 
	Dimension size= driver.manage().window().getSize();
    System.out.println(size);
	
	// get and print position of the window
	Point P = driver.manage().window().getPosition();
	System.out.println(P);
	
	//fullscreen
	driver.manage().window().fullscreen();
	
	//Capture and print the size 
	Dimension size1= driver.manage().window().getSize();
	System.out.println(size1);
		
	// get and print position of the window
	Point P1 = driver.manage().window().getPosition();
	System.out.println(P1);
	
	//set size
	Dimension Size=new Dimension(773,329);
	driver.manage().window().setSize(Size);
		
	//set position
    driver.manage().window().setPosition(new Point(600,400));

     //Capture and print the size 
      Dimension size2= driver.manage().window().getSize();
      System.out.println(size2);
      		
      // get and print position of the window
      Point P2 = driver.manage().window().getPosition();
      System.out.println(P2);
      	
	//	Close the browser using quit()
    driver.quit();
	
	driver.get("https://demowebshop.tricentis.com/");
	
	//Enter Search Text
	driver.findElement(By.xpath("//input[@value='Search store']")).sendKeys("Books");
	
	//Click Search Button
	driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
	
	//identify and click on first product 
	driver.findElement(By.cssSelector(".product-title a")).click();
	
	// Click on Add to Cart
    driver.findElement(By.id("add-to-cart-button-13")).click();

    // Wait for cart update (simple wait for demo)
    Thread.sleep(2000);
    
    // Click on Shopping Cart link
    driver.findElement(By.linkText("Shopping cart")).click();

    // Click on checkbox (Terms of service)
    driver.findElement(By.id("termsofservice")).click();

    Thread.sleep(5000);
    
    // Click on Update shopping cart button
    driver.findElement(By.name("updatecart")).click();

    // Capture and print cart message
    WebElement message = driver.findElement(By.cssSelector(".order-summary-content"));
    System.out.println(message.getText());

    driver.quit();
    */
	
	driver.get("https://www.firstcry.com/");
    
	Thread.sleep(3000);

    //  Click on Preschool Admissions
    driver.findElement(By.xpath("//a[@tabindex='-1' and contains(text(),'Preschool Admissions')]")).click();

    Thread.sleep(3000);

    // Click on Admission Enquiry
    driver.findElement(By.xpath("//button[@fdprocessedid='pl161']")).click();

 
    // Enter Name
    driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Bhagyashree");

    // Enter Email
    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@gmail.com");

    // Enter Mobile Number
    driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9876543210");

    // Enter City
    driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Bangalore");

    // Select Preschool (example dropdown)
    driver.findElement(By.xpath("//select[@name='preschool']")).sendKeys("EuroKids");

    Thread.sleep(2000);

    // Click Submit button
    driver.findElement(By.xpath("//button[@type='submit']")).click();

    Thread.sleep(3000);

    //  Capture success message
    WebElement successMsg = driver.findElement(By.xpath("//div[contains(text(),'Thank')]"));

    // Print success message
    System.out.println(successMsg.getText());

    // Close browser
    driver.quit();
}
}
		


