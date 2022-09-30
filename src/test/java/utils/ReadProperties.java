package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static String readConfigProperties(String key) {
		Properties prop = new Properties();
		String value = null;
		try {
			prop.load(new FileInputStream(new File("./src/test/resources/Config.properties")));
			value = prop.getProperty(key);
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}
		return value;
	}
	
	public static String readObjectProperties(String filName, String key) {
		Properties prop = new Properties();
		String value = null;
		try {
			prop.load(new FileInputStream(new File("./src/test/resources/ObjectRepostories/"+filName+".properties")));
			value = prop.getProperty(key);
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}
		return value;
	}

}