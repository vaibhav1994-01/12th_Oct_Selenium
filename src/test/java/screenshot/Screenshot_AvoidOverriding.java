package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_AvoidOverriding {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Generating random name to screenshot
		String randomString = UUID.randomUUID().toString(); //UUID(Universally Unique Identifier) is a class, randomUUID is a static method.
		String ProjectName = "Amazon_";
		
		//Capture Screenshot
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File path = new File(System.getProperty("user.dir") + File.separator + "Screenshot" + File.separator + ProjectName + randomString + ".png");
		//Avoids override of screenshot.
	
		//Copying to folder
		FileHandler.copy(src, path);
		
		System.out.println("Path : " + path.getAbsolutePath());
		driver.close();
	}

}
