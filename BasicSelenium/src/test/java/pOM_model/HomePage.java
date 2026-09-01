package pOM_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	    @FindBy(linkText = "Projects")
	    private WebElement projectsLink;

	    public HomePage(WebDriver driver) {
	        PageFactory.initElements(driver, this);
	    }

	    public void clickProjects() {
	        projectsLink.click();
	    }
	}
