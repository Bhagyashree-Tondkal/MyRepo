import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_value {
	public static void main(String[] args) throws InterruptedException { 
		
		
		//launch Chrome browser
			ChromeDriver driver = new ChromeDriver();
			
			//Maximize browser
			driver.manage().window().maximize();
			
			driver.get("https://www.firstcry.com/");
			
			Thread.sleep(3000);

		    //  Click on Preschool Admissions
		    String attributeValue = driver.findElement(By.xpath("//a[(text(),'Preschool Admissions'and @tabindex='-1']")).getAttribute("tableindex");
		    System.out.println(attributeValue);
		   
		  String cssValue = driver.findElement(By.xpath("//a[text()='Admission Enquiry'and @tableindex='-1']")).getCssValue("color");
		  System.out.println(cssValue);
		  
		  
		  driver.findElement(By.xpath("//a[text()='Admission Enquiry'and @tableindex='-1']")).click();

		
	}
}
