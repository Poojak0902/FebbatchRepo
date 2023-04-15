package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
	
String filename = "C:\\Automation\\WorkSpace_FebBatch23\\FebBatchDemo\\config.properties";

private Properties prop;


public Properties readProperties() {
	prop = new Properties();
	
	try {
		FileInputStream file = new FileInputStream(filename);
		prop.load(file);
		
	} catch (FileNotFoundException e) {

		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
	
	return prop;
	
}





}
