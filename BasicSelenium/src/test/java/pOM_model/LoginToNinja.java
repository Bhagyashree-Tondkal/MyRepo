package pOM_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginToNinja {

	    // Locate Username Textbox
	    @FindBy(id = "usernmae")
	    private WebElement usernameTextfield;

	    // Locate Password Textbox
	    @FindBy(id = "inputPassword")
	    private WebElement passwordTextfield;

	    // Locate Login Button
	    @FindBy(xpath = "//button[@type='submit']")
	    private WebElement loginButton;

	    // Constructor
	    public void LoginPage(WebDriver driver) {
	        PageFactory.initElements(driver, this);
	    }

	    // Business Method
	    public void login(String username, String password) {
	        usernameTextfield.sendKeys(username);
	        passwordTextfield.sendKeys(password);
	        loginButton.click();
	    }
	}

