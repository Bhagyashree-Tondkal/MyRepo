package TestNG;

import org.junit.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class ConfigAnnotation {
	
	@BeforeSuite
	public void bs() {
		System.out.println("CONNECT TO DB");
	}
	
	@BeforeClass
	public void BC() {
		System.out.println("LAUNCH BROWSER");
	}
	
	@BeforeMethod
	public void bm() {
		System.out.println("LOGIN");
	}
    @AfterTest
    public void AT() {
	System.out.println("CLOSE BROWSER");
    }

    @AfterMethod
    public void Am() {
	System.out.println("LOGOUT");
    }
    @AfterSuite
    public void AS() {
	System.out.println("DISCONNECT DB");
    }
    @AfterClass
    public void Ac() {
	System.out.println("CLOSE BROWSER");
    }
    }
