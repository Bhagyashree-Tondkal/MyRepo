package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Organization_information {
	
	WebDriver driver;
	public Organization_information(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name = "accountname")
	private WebElement Org_name;
	
	@FindBy(xpath = "(//input[@class='crmbutton small save'])[1]")
	private WebElement savebtn;
	
	@FindBy(name = "industry")
	private WebElement industryDD;
	
	@FindBy(className = "dvHeaderText")
	private WebElement headermsg;
	
	public WebElement getIndustry() {
		return industryDD;
	}

	@FindBy(id = "phone")
	private WebElement phone_num;
	
	@FindBy(id = "email1")
    private WebElement email;
	
	public WebElement getPhone_num() {
		return phone_num;
	}

	public WebElement getEmail() {
		return email;
	}
	
	public WebElement getOrg_name() {
		return Org_name;
	}
	public WebElement getSavebtn() {
		return savebtn;
	}
	public WebElement getHeadermsg() {
		return headermsg;
	}
	
	public void Org_Information(String orgname) {
		Org_name.sendKeys(orgname);
		savebtn.click();
	
	}
	public void Org_Information(String orgname, String industry) {
		Org_name.sendKeys(orgname);
		Select sel = new Select(industryDD);
		sel.selectByVisibleText(industry);
		savebtn.click();
	}
	
	public void Org_Information(String orgname, long phonenum) {
		Org_name.sendKeys();
		phone_num.sendKeys();
		savebtn.click();
	}
	
	}
	

