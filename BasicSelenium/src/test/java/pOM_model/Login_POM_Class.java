package pOM_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Login_POM_Class {
	
	
	    // WebElements / Locators

	    @FindBy(name = "username")
	    private WebElement usernameTextField;

	    @FindBy(name = "password")
	    private WebElement passwordTextField;

	    @FindBy(xpath = "//button[text()='Login']")
	    private WebElement loginButton;


	    // Constructor

	    public Login_POM_Class(WebDriver driver) {
	        PageFactory.initElements(driver, this);
	    }


	    // Business Logic / Page Actions

	    public void enterUsername(String username) {
	        usernameTextField.sendKeys(username);
	    }

	    public void enterPassword(String password) {
	        passwordTextField.sendKeys(password);
	    }

	    public void clickLoginButton() {
	        loginButton.click();
	    }


	    // Complete Login Method

	    public void login(String username, String password) {

	        usernameTextField.sendKeys(username);
	        passwordTextField.sendKeys(password);
	        loginButton.click();
	    }
	}