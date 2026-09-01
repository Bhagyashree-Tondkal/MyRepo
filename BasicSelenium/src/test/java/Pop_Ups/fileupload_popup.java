package Pop_Ups;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload_popup {
	public static void main(String[] args) {
		
		//launch browser
		ChromeDriver driver= new ChromeDriver();
		
		//maximize
		driver.manage().window().maximize();
		
		//navigate to url
		driver.get("https://smallpdf.com/merge-pdf");
		
		//identify element
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\\\\\\\Users\\\\\\\\manik\\\\\\\\OneDrive\\\\\\\\Desktop\\\\\\\\Selenium\\\\\\\\Notes_8.pdf");
	}

}
