package TestNG;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import Listener_Utility.BaseClass;

@Listeners(Listener_Utility.Listener_Class.class)

public class HardAssert extends BaseClass{
@Test
public void hardassert() {
	String expectedTitle ="Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
	String actTitle=driver.getTitle();

	Assert.assertEquals(actTitle, expectedTitle);

}

@Test
public void Softassert() {
	
	String expectedTitle ="Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
	String actTitle=driver.getTitle();
	String url=driver.getCurrentUrl();
	SoftAssert soft = new SoftAssert();
	soft.assertEquals(actTitle, expectedTitle);
	soft.assertTrue(true);
	
	soft.assertTrue(url.contains("8888"));
	System.out.println("yes");
	
	
	soft.assertAll();
}
}
	
		