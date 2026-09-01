package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	
	WebDriver driver;
	public Home_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText = "Organizations")
	private WebElement Org_link;
	
	@FindBy(linkText = "Contacts")
	private WebElement contacts_link;
	
	@FindBy(linkText = "Campaigns")
	private WebElement campaigns_link;
	
	@FindBy(linkText = "More")
	private WebElement More_link;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminimg;
	
	@FindBy(xpath = "//a[contains(text(),'Sign Out')]")
	private WebElement signoutlink;
	
	@FindBy(linkText = "Leads")
	private WebElement Leads_Link;
	
	@FindBy(linkText="Products")
    private WebElement Productslnk;
	
	public WebElement getProductslnk() {
		return Productslnk;
	}

	public WebElement getOrg_link() {
	return Org_link;
	}

	public WebElement getLeads_Link() {
		return Leads_Link;
	}

	public WebElement getContacts_link() {
		return contacts_link;
	}

	public WebElement getCampaigns_link() {
		return campaigns_link;
	}

	public WebElement getMore_link() {
		return More_link;
	}
    public void navigateToCampaignLink() {
		Actions ac = new Actions(driver);
		ac.moveToElement(More_link).perform();
		campaigns_link.click();	
	}
	public void logout() {
		Actions ac = new Actions(driver);
		ac.moveToElement(adminimg).perform();
		signoutlink.click();
		
	}

}
