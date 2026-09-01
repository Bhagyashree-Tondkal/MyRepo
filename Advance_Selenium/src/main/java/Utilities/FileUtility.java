package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility {

	public String getDataFromPropertiesFile(String key) throws Exception {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\manik\\eclipse-workspace\\Advance_Selenium\\src\\main\\resources\\CommonData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String data = prop.getProperty(key);
		
		fis.close();
		
		return data;
	}
	
public String getDataVtiger(String key) throws Exception {
		
		FileInputStream fisVtiger = new FileInputStream("C:\\Users\\manik\\eclipse-workspace\\Advance_Selenium\\src\\main\\resources\\cData_Vtiger.properties");
		Properties prop = new Properties();
		prop.load(fisVtiger);
		String data = prop.getProperty(key);
		
		
		
		return data;
	}

}
