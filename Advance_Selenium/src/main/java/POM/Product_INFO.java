package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_INFO {
	
	WebDriver driver;
	public Product_INFO(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(name = "productname")
    private WebElement productname;
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement savebtn;
	
	public WebElement getproductname() {
    	return productname;
    }
	
	public WebElement getsavebtn() {
		return savebtn;
	}

	
	
}
