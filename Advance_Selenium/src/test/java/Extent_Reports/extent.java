package Extent_Reports;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Listener_Utility.Listener_Class;

public class extent extends Listener_Class{
	
	@Test()
	public void Createcontact() throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
	
		TakesScreenshot sc = (TakesScreenshot)driver;
		String filepath = sc.getScreenshotAs(OutputType.BASE64);
		String time = new Date().toString().replace(" ", "_").replace(":", "_");
	
		ExtentTest test= report.createTest("Createcontact");
		test.log(Status.INFO, "login");
		test.log(Status.INFO, "navigate");
		test.log(Status.INFO, "create");
		
		if("Hhdfc".equals("hdfc")) {
			test.log(Status.PASS, "created");
		}
		else {
			test.addScreenCaptureFromBase64String(filepath, "ErrorFile");
		}
		
		driver.close();
		
	}
	
}