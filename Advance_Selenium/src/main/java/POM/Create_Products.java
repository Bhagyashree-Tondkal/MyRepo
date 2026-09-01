package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Products{
	
   WebDriver driver; 
    public Create_Products(WebDriver driver) {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
	
	@FindBy(xpath="//img[@title='Create Product...']")
    private WebElement CreateProductslnk;
	
	public WebElement getCreateProductslnk() {
		return CreateProductslnk;
	}
}
