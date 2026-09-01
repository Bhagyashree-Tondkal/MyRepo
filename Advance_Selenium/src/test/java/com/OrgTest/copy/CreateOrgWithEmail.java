package com.OrgTest.copy;

import org.testng.annotations.Test;

import Listener_Utility.BaseClass;
import POM.Create_New_Organization_page;
import POM.Home_page;
import POM.Organization_information;

public class CreateOrgWithEmail extends BaseClass {
	
	@Test
	public void CreateOrg_WithEmail() throws Exception {
		
		String orgname = elib.getDataFromExcelVtiger("ORG", 13, 2)+jlib.getRandomNumber();
		String email = elib.getDataFromExcelVtiger("ORG", 13, 3)+jlib.getRandomNumber();
		
		//click on org link
		Home_page h= new Home_page(driver);
		h.getOrg_link().click();
		
		//click on create new org (+) symbol
		Create_New_Organization_page c = new Create_New_Organization_page(driver);
		c.getCreateORG().click();
		
		//enter orgname and click on save
		Organization_information i = new Organization_information(driver);
		i.getOrg_name().sendKeys(orgname);
		i.getEmail().sendKeys(email);
		i.getSavebtn().click();	
		
		h.logout();
		driver.quit();
	}
}
