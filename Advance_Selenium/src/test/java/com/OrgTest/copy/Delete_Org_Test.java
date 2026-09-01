package com.OrgTest.copy;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import Listener_Utility.BaseClass;
import POM.Create_New_Organization_page;
import POM.Home_page;
import POM.Organization_information;
import Utilities.WebDriverUtility;


public class Delete_Org_Test extends BaseClass {
	@Test
	public void Delete_Org() throws Exception {
	
		WebDriverUtility wlib=new WebDriverUtility();
        //read testScript data  from excel file
        String orgname=elib.getDataFromExcelVtiger("ORG", 1, 2)+jlib.getRandomNumber();
        
		//navigate to organization module
		Home_page h= new Home_page(driver);
		h.getOrg_link().click();
		
		//click on create new org (+) symbol
		Create_New_Organization_page c = new Create_New_Organization_page(driver);
		c.getCreateORG().click();
		
		//enter orgname and click on save
		Organization_information i = new Organization_information(driver);
		i.getOrg_name().sendKeys(orgname);
		i.getSavebtn().click();	
		
	//go back to org page
	Home_page hp= new Home_page(driver);
	hp.getOrg_link().click();

	//search for organization
	c.getsearchedt().sendKeys(orgname);
	
	wlib.select(c.getSearchfield(), "Organization Name");
	c.getSearchbtn().click();

	//in dynamic webtable select and delete ORG
	driver.findElement(By.xpath("//a[text()='"+orgname+"']/../../td[8]/a[text()='del']")).click();
	
	//handle alert
	wlib.switchToAlertAndAccept(driver);
	System.out.println("Org Deleted");
	
	//logout
	h.logout();
	driver.quit();
	
	}
}
