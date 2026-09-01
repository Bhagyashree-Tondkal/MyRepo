package DDT;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.Assert;

public class ReadDataFromDATABASE{

	    public static void main(String[] args) throws Exception {
        String expectedname="Bhagya";
         int expectedsalary=30000;

	        String url = "jdbc:mysql://localhost:3306/jdbc_demo";
	        String username = "root";
	        String password = "Lenevo@123";
	        
	        Connection con = DriverManager.getConnection(url, username, password);
	        System.out.println("Database Connected Successfully");
	        Statement stmt = con.createStatement();
	        ResultSet rs = stmt.executeQuery("select * from employee  ");
	        
	        if(rs.next()) {
	        	
	        	String actualname = rs.getString("name");
	        	int actualsalary = rs.getInt("salary");
	    
	        	//validation
	        	Assert.assertEquals(actualname, expectedname);
	        	Assert.assertEquals(actualsalary, expectedsalary);
	        	System.out.println("Database validation successful");
	        }
	        	
			con.close();  
	    }
}