package DDT;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadDataFromJSON {
	public static void main(String[] args) throws Exception, IOException, ParseException {
		
		JSONParser parser=new JSONParser();
		Object obj = parser.parse(new FileReader("C:\\Users\\manik\\eclipse-workspace\\Advance_Selenium\\src\\main\\resources\\json.json"));
		JSONObject map = (JSONObject) obj;
		System.out.println(map.get("url"));
		System.out.println(map.get("browser"));
		System.out.println(map.get("username"));
	}

}
