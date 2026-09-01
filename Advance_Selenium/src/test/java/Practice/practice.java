package Practice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Listener_Utility.BaseClass;

@Listeners(Listener_Utility.Listener_Class.class)
public class practice extends BaseClass{
	@Test(retryAnalyzer = Extent_Reports.Retry_Listener_imp.class)
	public void parc() throws Exception {
		
		
		String expname = "Bhagya";
		int ExpSalary=30000;
		
		  String url = "jdbc:mysql://localhost:3306/jdbc_demo";
	        String username = "root";
	        String password = "Lenevo@123";
		
		Connection con = DriverManager.getConnection(url, username, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select*from employee");
		System.out.println("database connected");
		
		if(rs.next()) {
			String actname = rs.getString("name");
			int actSalary = rs.getInt("salary");
			
			
			//validate
			Assert.assertEquals(actname, expname);
			Assert.assertEquals(actSalary, ExpSalary);
			System.out.println("varified");
		}
			con.close();	
	}

}
