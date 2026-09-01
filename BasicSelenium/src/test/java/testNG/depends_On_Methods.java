package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class depends_On_Methods {
	
	@Test (priority = 1)
    public void Login() 
    {
    Reporter.log("Login",true);

     }

      @Test(dependsOnMethods = "Login")
      public void SearchProduct() 
       {
   	Reporter.log("SearchProduct",true);
     	}


	@Test (dependsOnMethods ="SearchProduct" )
	public void AddToCart() throws InterruptedException 
{
		Reporter.log("AddToCart",true);
}
	
	@Test(dependsOnMethods = { "Login","SearchProduct","AddToCart"})
	public void Logout() 
{
	Reporter.log("Logout",true);
}
}


