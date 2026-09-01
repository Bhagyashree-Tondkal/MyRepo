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


public class CreateContactTest extends BaseClass{
	
	@Test
	public void Create_ContactTest() throws Exception {
	
        //read testScript data  from excel file
        String lastname = elib.getDataFromExcelVtiger("CONTACT",1,2)+jlib.getRandomNumber();
       
		//navigate to contacts module (home page)
		Home_page h= new Home_page(driver);
		h.getContacts_link().click();
		
		//click on + icon
		Create_New_Contact c = new Create_New_Contact(driver);
		c.getCreateContacts().click();
		
		//enter lastname and click on save button
		Contact_Info ci=new Contact_Info(driver) ;
			ci.getLastname().sendKeys(lastname);
			ci.getSavebtn().click();
			
			h.logout();
			driver.quit();
	}
}
