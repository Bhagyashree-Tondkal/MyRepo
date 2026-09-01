package ContactTest;

import org.testng.annotations.Test;

import Listener_Utility.BaseClass;
import POM.Create_Products;
import POM.Home_page;
import POM.Product_INFO;

public class CreateProduct extends BaseClass {
	@Test
	public void Create_Product() throws Exception {
	
	String productname = elib.getDataFromExcelVtiger("PRODUCTS", 7, 2)+jlib.getRandomNumber();
		
	//click on products link	
	Home_page h= new Home_page(driver);
	h.getProductslnk().click();
	
	//click on +icon
	Create_Products cp = new Create_Products(driver);
	cp.getCreateProductslnk().click();
	
	//enter product name and save
	Product_INFO p = new Product_INFO(driver);
	p.getproductname().sendKeys(productname);
	p.getsavebtn().click();

	h.logout();
	driver.quit();
}
}