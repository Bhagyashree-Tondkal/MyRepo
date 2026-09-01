package DDT;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import AdvanceSelenium.ExcelUtility;

public class NinjaHRM {
	    public static void main(String[] args) throws Exception {

	        // Read Excel Data
	        ExcelUtility eUtil = new ExcelUtility();

	        String projectName = eUtil.getExcelData("Sheet1", 2, 0);
	        String managerName = eUtil.getExcelData("Sheet1", 2, 1);
	        String status = eUtil.getExcelData("Sheet1", 2, 2);

	        // Read Properties File
	        FileInputStream fis = new FileInputStream(
	                "C:\\Users\\manik\\eclipse-workspace\\BasicSelenium\\src\\test\\resources\\commondata.properties");

	        Properties prop = new Properties();
	        prop.load(fis);
	        fis.close();

	        String browser = prop.getProperty("browser");
	        String url = prop.getProperty("url");
	        String username = prop.getProperty("username");
	        String password = prop.getProperty("password");

	        // Launch Browser
	        WebDriver driver = null;

	        if (browser.equalsIgnoreCase("chrome")) {
	            driver = new ChromeDriver();
	        } else {
	            System.out.println("Invalid Browser");
	            return;
	        }

	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        // Open Application
	        driver.get(url);

	        // Login
	        driver.findElement(By.id("username")).sendKeys(username);
	        driver.findElement(By.id("inputPassword")).sendKeys(password);
	        driver.findElement(By.xpath("//button[@type='submit']")).click();
	        
	        Thread.sleep(5000);
	        
	        // Click Projects
	        driver.findElement(By.linkText("Projects")).click();

	        // Click Create Project
	        driver.findElement(By.xpath("//span[contains(text(),'Create Project')]")).click();

	        // Enter Project Name
	        driver.findElement(By.name("projectName")).sendKeys(projectName);

	        // Enter Manager Name
	        driver.findElement(By.name("createdBy")).sendKeys(managerName);

	        // Select Status
	        WebElement dropdown = driver.findElement(By.xpath("(//select[@name='status'])[2]"));
	        Select select = new Select(dropdown);
	        select.selectByVisibleText(status);
	        
	        // Click Add Project
	        driver.findElement(By.xpath("//input[@value='Add Project']")).click();

	        System.out.println("Project Created Successfully");
	    }
	}
				    

				

