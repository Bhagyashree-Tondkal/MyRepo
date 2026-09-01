package Extent_Reports;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Listener_imp implements IRetryAnalyzer {

	int count=0;
	int limitcount=2;
	
	public boolean retry(ITestResult result) {
		
		if(count<limitcount) {
			count++;
			return true;
			
		}
		
		return false;
	}
	
	

}
