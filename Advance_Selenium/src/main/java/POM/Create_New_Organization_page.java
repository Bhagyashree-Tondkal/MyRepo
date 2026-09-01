package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_New_Organization_page {
	WebDriver driver;
	public Create_New_Organization_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "//img[@alt='Create Organization...']")
	private WebElement CreateORG;
	
	@FindBy(name = "search_text")
	private WebElement searchedt;
	
	@FindBy(name = "search_field")
	private WebElement searchfield;
	
	@FindBy(name = "submit")
	private WebElement searchbtn;
	
	public WebElement getSearchfield() {
		return searchfield;
	}
	public WebElement getSearchbtn() {
		return searchbtn;
	}
	public WebElement getCreateORG() {
		return CreateORG;
	}
	public WebElement getsearchedt() {
		return searchedt;
	}
	
	public void Create_New_Organization() {
		CreateORG.click();
	}
	
	
	

}
