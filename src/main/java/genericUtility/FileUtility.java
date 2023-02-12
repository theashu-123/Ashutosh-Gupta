package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
	public String fetchDataFromPropertiesFile(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./testdata/propertData.properties");
		Properties property = new Properties();
		property.load(fis);
		
		return property.getProperty(key);
	
	}

}
