package pOM_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProjectPage {
	
	
	    @FindBy(xpath = "//span[text()='Create Project']")
	    private WebElement createProjectButton;

	    @FindBy(name = "projectName")
	    private WebElement projectNameTextfield;

	    @FindBy(name = "createdBy")
	    private WebElement managerTextfield;

	    @FindBy(name = "status")
	    private WebElement statusDropdown;

	    @FindBy(xpath = "//input[@value='Add Project']")
	    private WebElement addProjectButton;

	    public void CreateProjectPage(WebDriver driver) {
	        PageFactory.initElements(driver, this);
	    }

	    public void createProject(String projectName, String manager, String status) {

	        createProjectButton.click();

	        projectNameTextfield.sendKeys(projectName);

	        managerTextfield.sendKeys(manager);

	        Select select = new Select(statusDropdown);
	        select.selectByVisibleText(status);

	        addProjectButton.click();
	    }
	}

