package com.OrgTest.copy;
import org.testng.annotations.Test;
import Listener_Utility.BaseClass;
import POM.Create_New_Organization_page;
import POM.Home_page;
import POM.Organization_information;


public class CreateOrgWithIndustries extends BaseClass {
	@Test
	public void CreateOrgWithIndustriess() throws Exception {
		
       
		String orgname = elib.getDataFromExcelVtiger("ORG", 1, 2)+jlib.getRandomNumber();
		
		//navigate to organization module
		Home_page h= new Home_page(driver);
		h.getOrg_link().click();
		
		//click on create new org (+) symbol
		Create_New_Organization_page c = new Create_New_Organization_page(driver);
		c.getCreateORG().click();
		
		//enter orgname and click on save
		Organization_information i = new Organization_information(driver);
		i.getOrg_name().sendKeys(orgname);
		i.getIndustry().sendKeys("Banking");
		i.getSavebtn().click();	
	
		h.logout();
		driver.quit();
}  

}
