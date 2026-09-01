package TestNG;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider{
	@Test(dataProvider = "getdata")
	public void sample(String fn, String ln) {
		System.out.println("fn:"+fn+"ln"+ln);
	}
	
    @DataProvider
    public Object[][] getdata() {
    	Object[][] obj=new Object[2][2];
    	obj[0][0]="hj";
    	obj[0][1]="hj";
    	obj[1][0]="hj";
    	obj[1][1]="hj";
    	return obj;			
    }
}