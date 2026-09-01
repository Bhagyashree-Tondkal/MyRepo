package TestNG;

import org.testng.Assert;

import org.testng.annotations.Test;

import Listener_Utility.BaseClass;

public class CreateInvoice  {

	@Test(retryAnalyzer = Extent_Reports.Retry_Listener_imp.class)
	public void Create_Invoice() {
		System.out.println("execute CreateInvoice");

		String acttitle = BaseClass.sdriver.getTitle();
		
		Assert.assertEquals(acttitle, "Home Page");
		
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
	}
	/*
	@Test
    public void CreateInvoice_with_Contact() {
		System.out.println("execute CreateInvoice"); 
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
	}
	*/
}
