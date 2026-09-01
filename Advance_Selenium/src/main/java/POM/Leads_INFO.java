package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Leads_INFO {

	WebDriver driver;
	public Leads_INFO(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "lastname")
	private WebElement lastnameText;
	
	@FindBy(name="company")
	private WebElement company_name;
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement savebtn;
	
	public WebElement getlastnameText() {
		return lastnameText;
	}

	public WebElement getCompany_name() {
		return company_name;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}
	
	public void CreateLeadBy_lastname_company(String lastname,String companyname) {
		lastnameText.sendKeys(lastname);
		company_name.sendKeys(companyname);
		savebtn.click();
	}

}
