package Practice;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import Utilities.ExcelUtility;
import Utilities.FileUtility;
import Utilities.JavaUtility;

public class NinjaHrm {
public static void main(String[] args) throws Exception {
		
		//create object
		FileUtility flib=new FileUtility();
		ExcelUtility elib = new ExcelUtility();
		JavaUtility jlib= new JavaUtility();
		
		//read data from properties file
		String BROWSER = flib.getDataFromPropertiesFile("browser");
        String URL = flib.getDataFromPropertiesFile("url");
        String USERNAME = flib.getDataFromPropertiesFile("username");
        String PASSWORD = flib.getDataFromPropertiesFile("password");
        
        WebDriver driver = null;
		
		if(BROWSER.equals("firefox"))  {
			driver=new FirefoxDriver();	
		}
		else if(BROWSER.equals("edge")) {
			driver=new EdgeDriver();
		}
		else if(BROWSER.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else {
			driver=new ChromeDriver();
		}
		
		 driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       
        //Read testscript data from excel file using excelutility
        
        String Projectname = elib.getDataFromExcel("Sheet1", 1, 0);
        String ProjectManager = elib.getDataFromExcel("Sheet1", 1, 1);
        String status = elib.getDataFromExcel("Sheet1", 1, 2);
        
        // Open Application
        driver.get(URL);
        
        // Login
        driver.findElement(By.id("username")).sendKeys(USERNAME);
        driver.findElement(By.id("inputPassword")).sendKeys(PASSWORD);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
       Thread.sleep(5000);
        
        // Click Projects
        driver.findElement(By.linkText("Projects")).click();

        // Click Create Project
        driver.findElement(By.xpath("(//i[@class='material-icons'])[1]")).click();

        // Enter Project Name
        driver.findElement(By.name("projectName")).sendKeys(Projectname);

        // Enter Manager Name
        driver.findElement(By.name("createdBy")).sendKeys(ProjectManager);

        // Select Status
        WebElement dropdown = driver.findElement(By.xpath("(//select[@name='status'])[1]"));
        
        Select select = new Select(dropdown);
        select.selectByVisibleText(status);
        Thread.sleep(4000);
        
        // Click Add Project
        driver.findElement(By.xpath("//input[@value='Add Project']")).click();

        System.out.println("Project Created Successfully");
        System.out.println("Project Name    : " + Projectname);
        System.out.println("Project Manager : " + ProjectManager);
       System.out.println("Project Status  : " + status);

        // Close browser
         driver.close(); 
	}

}
