package DDT;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadDataFrom_Properties_File {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\manik\\eclipse-workspace\\Advance_Selenium\\src\\main\\resources\\CommonData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String data = prop.getProperty("url");
		System.out.println(data);
	}
}
