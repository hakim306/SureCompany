package testCases;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.json.Json;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.HomePage;

public class JsonReader {
	
	  @DataProvider(name="dp")
	    public static Object[] dataProvider1() throws org.json.simple.parser.ParseException, ParseException {
	        JSONParser parser = new JSONParser();
	        JSONObject jsonObject = null;

	        // Read JSON file
	        try {
	            Object obj = parser.parse(new FileReader("Data/testData.json"));
	            jsonObject = (JSONObject) obj;
	        } catch (IOException exception) {
	            exception.printStackTrace();
	        }

	        // Array to store JSON data
	        Object[] data = new Object[1];

	        // Store JSON data as key/value pairs in a hashMap
	        HashMap<String, String> hashMap = new LinkedHashMap<>();
	        if (jsonObject != null) {
	            Set<String> jsonObjKeys = jsonObject.keySet();
	            for (String jsonObjKey : jsonObjKeys) {
	                hashMap.put(jsonObjKey, (String) jsonObject.get(jsonObjKey));
	            }
	        } else {
	            //log.error("Error retrieving JSON data");
	            throw new RuntimeException();
	        }

	        // Store HashMap in an array and return array
	        data[0] = hashMap;
	        return data;
	    }

}
