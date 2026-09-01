package TP_Advance_selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.devtools.v141.indexeddb.model.Key;

import com.beust.jcommander.defaultprovider.PropertyFileDefaultProvider;


public class DDT {
	
	public String data(String key) throws Exception {
	
	
	FileInputStream fis = new FileInputStream("./src/main/resources/CommonData.properties");
	
	Properties p = new Properties();
	
	p.load(fis);
	return p.getProperty(key);
	
	}

	public static void main(String[] args)  {
		DDT d = new DDT();
		
		
	
		
	
	}
	
	
		
		
	
}
