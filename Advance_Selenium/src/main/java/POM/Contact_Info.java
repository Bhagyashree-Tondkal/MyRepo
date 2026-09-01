package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.WebDriverUtility;

public class Contact_Info {
	
	WebDriverUtility wlib=new WebDriverUtility();
	WebDriver driver;
	public Contact_Info(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "lastname")
	private WebElement lastnameText;
	
	@FindBy(xpath = "(//img[@title='Select'])[1]")
	private WebElement SelectOrg;
	
	@FindBy(id ="search_txt" )
	private WebElement SearchOrg;
	
	@FindBy(name = "search")
	private WebElement SearchButton;
	
	@FindBy(xpath = "//a[@id='1']")
	private WebElement ClickOnOrgname ;
	
	@FindBy(name = "support_start_date")
	private WebElement supportstartDate;
	
	@FindBy(name = "support_end_date")
	private WebElement Supportenddate;
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement savebtn;

	public WebElement getSelectOrg() {
		return SelectOrg;
	}
	public WebElement getSearchOrg() {
		return SearchOrg;
	}
	public WebElement getSearchButton() {
		return SearchButton;
	}
	public WebElement getClickOnOrgname() {
		return ClickOnOrgname;
	}
	public WebElement getsupportstartDate() {
		return supportstartDate;
	}
	public WebElement getSupportenddate() {
		return Supportenddate;
	}
		
	public WebElement getLastname() {
		return lastnameText;
	}
	public WebElement getSavebtn() {
		return savebtn;	
	}
	
	public void CreateContact_With_Org(String lastname, String orgname) {
		lastnameText.sendKeys(lastname);
		SelectOrg.click();
		wlib.switchToTabOnTitle(driver, "Contacts&action");
		SearchOrg.sendKeys(orgname);
		SearchButton.click();
		ClickOnOrgname.click();
		
		
	}
	
	

}
