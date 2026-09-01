package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_New_Contact {
	WebDriver driver;
	    public Create_New_Contact(WebDriver driver) {
	    	this.driver=driver;
	    	PageFactory.initElements(driver, this);
	    }
	    
	    @FindBy(className = "dvHeaderText")
	    private WebElement headermsg;
	    
	    
	    public WebElement getHeadermsg() {
			return headermsg;
		}

		@FindBy(xpath="//img[@title='Create Contact...']")
	    private WebElement Createcontacts;
	    
	    public WebElement getCreateContacts() {
	    	return Createcontacts;
	    }

		public void Contacts_link() {
			Createcontacts.click();
		}

}
