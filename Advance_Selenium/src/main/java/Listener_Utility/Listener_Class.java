package Listener_Utility;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listener_Class implements ITestListener, ISuiteListener{
	
	public ExtentSparkReporter spark;
	public static ExtentReports report;
	ExtentTest test;
	String testname;
	
	@Override
	public void onStart(ISuite suite) 
	{
		System.out.println("Report configuration");
		//Spark report config
		
		String time =  new Date().toString().replace(" ", "_").replace(":", "_");
		spark = new ExtentSparkReporter("./AdvanceReport/report"+time+".html");
		spark.config().setDocumentTitle("CRM Test Suite Results");
		spark.config().setReportName("CRM Report");
		spark.config().setTheme(Theme.DARK);
		
		//add environment information
		 report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("OS", "windows-10");
		report.setSystemInfo("browser", "chrome");
	}
	
	@Override
	public void onFinish(ISuite suite) {
		System.out.println("Report backup");
		report.flush();
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("=============="+result.getMethod().getMethodName()+"====start=====");
		test= report.createTest(result.getMethod().getMethodName());
		test.log(Status.INFO,result.getMethod().getMethodName()+"==STARTED==");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("=============="+result.getMethod().getMethodName()+"====End=====");
		test.log(Status.PASS,result.getMethod().getMethodName()+"==COMPLETED==");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		String testname=result.getMethod().getMethodName();
		
	  TakesScreenshot ts = (TakesScreenshot) BaseClass.sdriver;
	  
	  String filepath = ts.getScreenshotAs(OutputType.BASE64);
	  
	  String time = new Date().toString().replace(" ", "_").replace(":", "_");
	  
	  test.addScreenCaptureFromBase64String(filepath, testname+"_"+time); 
	  
		test.log(Status.FAIL,result.getMethod().getMethodName()+"==FAILED==");
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
		//System.out.println("before <test> starts");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		//System.out.println("after <test>");
	}
	
	
	
}