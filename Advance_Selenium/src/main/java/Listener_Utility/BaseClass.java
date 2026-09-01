package Listener_Utility;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import POM.Home_page;
import POM.Login_Page;
import Utilities.DataBaseUtility;
import Utilities.ExcelUtility;
import Utilities.FileUtility;
import Utilities.JavaUtility;


public class BaseClass {
	
	public WebDriver driver = null;
	public static WebDriver sdriver = null;
	
	public FileUtility flib=new FileUtility();
	public ExcelUtility elib = new ExcelUtility();
	public JavaUtility jlib= new JavaUtility();
	public DataBaseUtility dlib = new DataBaseUtility();
	public ExtentSparkReporter spark;
	public ExtentReports report;
	
	@BeforeSuite
	public void connectToDB() throws Exception {
		System.out.println("ConnectToDB");
		dlib.getDBconnection();
		
		//Spark report config
				spark = new ExtentSparkReporter("./AdvanceReport/report.html");
				spark.config().setDocumentTitle("CRM Test Suite Results");
				spark.config().setReportName("CRM Report");
				spark.config().setTheme(Theme.STANDARD);
				
				//add environment information
				 report = new ExtentReports();
				report.attachReporter(spark);
				report.setSystemInfo("OS", "windows-10");
				report.setSystemInfo("browser", "chrome");
	}
	
	@BeforeClass
	public void luanchBrowser() throws Exception {
		System.out.println("Launch the browser");
		
		String BROWSER = flib.getDataVtiger("Browser");
		
		if(BROWSER.equals("firefox"))  {
			driver = new FirefoxDriver();	
		}
		else if(BROWSER.equals("edge")) {
			driver = new EdgeDriver();
		}
		else if(BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else {
			driver=new ChromeDriver();
		}
		sdriver =driver;
	}
	

	@BeforeMethod
	public void Login() throws Exception {
		System.out.println("enter url");
		System.out.println("Login To App");
		
        String URL = flib.getDataVtiger("Url");
        String USERNAME = flib.getDataVtiger("Username");
        String PASSWORD = flib.getDataVtiger("Password");
        
        Login_Page lp = new Login_Page(driver);
        
        lp.LoginToApp(URL, USERNAME, PASSWORD);
	}
	
    @AfterMethod
    public void Log_out() {
	System.out.println("Logout");
	
	Home_page h = new Home_page(driver);
	h.logout();
	
}
    @AfterClass
    public void CloseBrowser() {
	System.out.println("CloseBrowser");
	driver.quit();
}

	@AfterSuite
	public void DisconnectDB() {
		System.out.println("DisconnectDB");
		dlib.closeDbconnection();
		report.flush();
}

}
