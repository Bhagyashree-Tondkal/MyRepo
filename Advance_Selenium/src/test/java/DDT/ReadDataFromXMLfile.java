package DDT;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ReadDataFromXMLfile {
	
	@Test
	public void test(XmlTest test) {
		System.out.println(test.getParameter("url"));
	
	}
	}


