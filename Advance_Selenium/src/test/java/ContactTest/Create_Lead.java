package ContactTest;

import org.testng.annotations.Test;
import Listener_Utility.BaseClass;
import POM.Create_Leads;
import POM.Home_page;
import POM.Leads_INFO;

public class Create_Lead extends BaseClass {
	
	@Test
	public void CreateLead() throws Exception {
		
		String lastname = elib.getDataFromExcelVtiger("Leads", 1, 2)+jlib.getRandomNumber();
		String Companyname = elib.getDataFromExcelVtiger("Leads", 1, 3)+jlib.getRandomNumber();
		
		//click on leads link
		Home_page hp = new Home_page(driver);
		hp.getLeads_Link().click();
		
		//click on + icon
		Create_Leads cl = new Create_Leads(driver);
		cl.getLead_create_button().click();
	
		//enter lastname and company name and save
		Leads_INFO l = new Leads_INFO(driver);
		l.getlastnameText().sendKeys(lastname);
		l.getCompany_name().sendKeys(Companyname);
		l.getSavebtn().click();
		
		hp.logout();
		driver.quit();
	}
}
