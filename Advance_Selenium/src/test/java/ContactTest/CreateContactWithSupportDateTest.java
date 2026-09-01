package ContactTest;
import java.time.Duration;
import org.testng.annotations.Test;
import Listener_Utility.BaseClass;
import POM.Contact_Info;
import POM.Create_New_Contact;
import POM.Home_page;

public class CreateContactWithSupportDateTest extends BaseClass {
	@Test
	public void CreateContactWithSupportDateTest() throws Exception {
	
        //read testScript data  from excel file
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
		
		//enter lastname Support  start click on save button
		Contact_Info ci=new Contact_Info(driver) ;
			ci.getLastname().sendKeys(lastname);
			
			//enter Support  start Date 
			String startdate = jlib.getSystemDateYYYYDDMM();
			ci.getsupportstartDate().clear();
			ci.getsupportstartDate().sendKeys(startdate);
			String datas=ci.getsupportstartDate().getText();
			
			//enter support enddate
			String enddate = jlib.getRequiredDateYYYYDDMM(30);
			ci.getSupportenddate().clear();
			ci.getSupportenddate().sendKeys(enddate);
			String data=ci.getSupportenddate().getText();
			System.out.println(data);
			
		    //save
			ci.getSavebtn().click();
			
			h.logout();
			driver.quit();
	
}
}
