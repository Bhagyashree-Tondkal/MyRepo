package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Declaration
	
	@FindBy (xpath="//input[@id='Email']")
	private WebElement TextField;
	
	public WebElement getTextField() {
		return TextField;
	}

	@FindBy (xpath="//input[@id='Email']")
	private WebElement EmailTextField;
	
	@FindBy (id="Password")
	private WebElement PasswordTextField;
	
	@FindBy (xpath="//input[@value='Log in']")
	private WebElement LoginInButton;
	
	//initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

}
