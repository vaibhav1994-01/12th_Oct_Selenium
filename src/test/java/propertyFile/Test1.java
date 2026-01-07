package propertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.Test;

public class Test1 {

	//How to read data from property file
	//Written this code just to understand property file concept
	//Actual we have to use config.properties file to store the data like URL,username,password,browser etc.
	//and use paramterization concept and pass the data from testng.xml file to execute the test cases.
	
	@Test
	public void sample() throws IOException {
		Properties prop = new Properties(); //Creating object of Properties class
		File file = new File
		("C:\\Users\\Admin\\git\\repository2\\12th_Oct_Selenium\\PropertyFile\\config.properties");//Specify the path of property file
		FileInputStream fis = new FileInputStream(file);//Creating object of FileInputStream class to read the property file
		
		prop.load(fis);//Loading all the data from property file to Properties class object
		System.out.println(prop.getProperty("devUrl"));
		System.out.println(prop.getProperty("Username_dev"));
		System.out.println(prop.getProperty("Password_dev"));
	}
}

