package ContactTest;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Listener_Utility.BaseClass;
import POM.Contact_Info;
import POM.Create_New_Contact;
import POM.Home_page;



public class CreateContactWithOrgTest extends BaseClass {
	@Test
	public void CreateContact_WithOrgTest() throws Exception {

        //read testScript data  from excel file
        String orgname=elib.getDataFromExcelVtiger("CONTACT",7,2);
        String lastname = elib.getDataFromExcelVtiger("CONTACT",1,2)+jlib.getRandomNumber();
        
		 driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://localhost:8888/");
	
		//navigate to contacts module (home page)
		Home_page h= new Home_page(driver);
		h.getContacts_link().click();
		
		//click on + icon
		Create_New_Contact c = new Create_New_Contact(driver);
		c.getCreateContacts().click();
		
		//enter lastname and ORG click on save button
		Contact_Info ci=new Contact_Info(driver) ;
		ci.CreateContact_With_Org(lastname, orgname);
		ci.getSavebtn().click();
		
		//verify header msg 
		String Actheader = c.getHeadermsg().getText();
		Boolean status=Actheader.contains(lastname);
	    Assert.assertEquals(status, true);
	    
	    String actlastname=driver.findElement(By.id("dtlview_Last Name")).getText();
	    SoftAssert soft = new SoftAssert();
	    soft.assertEquals(actlastname, lastname);
			
	    h.logout();
	    driver.quit();
		
			
		
}		
}
