package manage_methods;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getposition {

	public static void main(String[] args) throws InterruptedException {
		//create object for chromebrowser class
	    ChromeDriver driver=new ChromeDriver();
	    
	    //capture window size
	    Dimension size= driver.manage().window().getSize();
	    
	    //printing statement
	    System.out.println(size);
	    
	    //print height
	    System.out.println(size.getHeight());
	    
	    //print width
	    System.out.println(size.getWidth());
		
	    //capture position
	    Point p=driver.manage().window().getPosition();
	    
	    //print position
	    System.out.println(p);
	    
	    Point point =new Point(-5,5);
	    
	    driver.manage().window().setPosition(point);
	    
	    //
	    Point target =driver.manage().window().getPosition();
	    
	   
	    
	    System.out.println(target);
	  
	}

}
