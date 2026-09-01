package Utilities;


import java.io.FileReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class JsonUtility {
	
	public String getDataFromJsonFile(String key) throws Throwable {
		FileReader fr= new FileReader("./src/main/resources/json.josn");
		
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(fr);
		JSONObject map=(JSONObject)obj;
		String data=(String) map.get(key);
		return data;
	}
		
	}


