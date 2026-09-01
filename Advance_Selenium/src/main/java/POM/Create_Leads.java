package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Leads {
	
	WebDriver driver;
	public Create_Leads(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@title='Create Lead...']")
	private WebElement Lead_create_button;

	public WebElement getLead_create_button() {
		return Lead_create_button;
	}
	}


