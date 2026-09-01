package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contacts_Link {
    WebDriver driver;
    
    public Contacts_Link(WebDriver driver) {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    
    @FindBy(linkText = "Contacts")
    private WebElement contacts;
    
    public WebElement getContacts() {
    	return contacts;
    }

	public void Contacts_link() {
		contacts.click();
	}
}
