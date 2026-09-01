package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_size_position_rect {
	

	public static void main(String[] args) {
			//launch Chrome browser
			ChromeDriver driver = new ChromeDriver();
			
			//Maximize browser
			driver.manage().window().maximize();
			
			driver.get("https://www.firstcry.com/");
			
			/*
			
			//identify and capture size of web element
			WebElement element = driver.findElement(By.xpath("//input[@id='search_box']"));
			
		
			Dimension size=element.getSize();
			
			System.out.println(size);
			
			System.out.println(size.getHeight());
			System.out.println(size.getWidth());
			
			//capture X and Y condition
			Point position = element.getLocation();
		
		System.out.println(position);
		System.out.println(position.getX());
		System.out.println(position.getY());

		//rectangle 	
		Rectangle rectangle = element.getRect();
		System.out.println(rectangle);
		System.out.println(rectangle.getHeight());
		System.out.println(rectangle.getWidth());
		System.out.println(rectangle.getY());
		System.out.println(rectangle.getX());
		
		*/
WebElement element = driver.findElement(By.xpath("//li[@aria-label='Boy Fashion']"));
Rectangle rectangle = element.getRect();
System.out.println(rectangle);
System.out.println(rectangle.getHeight());
System.out.println(rectangle.getWidth());
System.out.println(rectangle.getX());
System.out.println(rectangle.getY());

	}

}
