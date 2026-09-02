package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	WebDriver driver;
	public Home_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText = "Organizations")
	private WebElement Org_link;
	
	public WebElement getOrg_link() {
		return Org_link;
	}

	public WebElement getContacts_link() {
		return contacts_link;
	}

	@FindBy(linkText = "Contacts")
	private WebElement contacts_link;

}
