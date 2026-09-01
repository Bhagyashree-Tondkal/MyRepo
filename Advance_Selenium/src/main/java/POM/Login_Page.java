package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import Utilities.WebDriverUtility;

public class Login_Page extends WebDriverUtility{
	WebDriver driver;
	public Login_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	//object identification and initialization
	
	@FindBy(name="user_name")
	private WebElement usernameedt;
	
	@FindBy(name="user_password")
	private WebElement passwordedt;
	
	@FindAll({@FindBy(id="submitButton"),@FindBy(xpath="(//input[@value='Login'])[2]")})
	private WebElement loginbtnedt;
	
	//object encapsulation

	public WebElement getusernameedt() {
		return usernameedt;
	}

	public WebElement getpasswordedt() {
		return passwordedt;
	}

	public WebElement getloginbtnedt() {
		return loginbtnedt;
	}
	
	//provide action
	public void LoginToApp(String url ,String username, String password) {
		waitForPageToLoad(driver);
		driver.manage().window().maximize();
		driver.get(url);
	   usernameedt.sendKeys(username);
	   passwordedt.sendKeys(password);
	   loginbtnedt.click();
	
	}
}