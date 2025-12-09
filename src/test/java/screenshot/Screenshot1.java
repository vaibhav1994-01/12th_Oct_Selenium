package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
		
		//Capturing Screenshot
		//Steps - (TakesScreenshot) import interface, .getScreenshotAs(OutputType.FILE), store in variable
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String imageName = "Amazon"; //Amazon.png (image extension)
		
		//Copying to Folder
		//Steps - System.getProperty("user.dir") + "\\Screenshot\\";,store in variable
		String path = System.getProperty("user.dir") + "\\Screenshot\\";
		//String path1 = System.getProperty("C:\Users\Admin\eclipse-workspace\12th_Oct_Selenium\Screenshot");
		
		File screenshotFolder = new File(path);
		
		if(!screenshotFolder.exists())
		{
			screenshotFolder.mkdir();
		}
		File destn = new File(path + imageName + ".png");
		FileHandler.copy(source, destn); //always select FileHandler.org.openqa.selenium from list
		
		System.out.println("Screenshot stored at "+ destn.getAbsolutePath());
		
		driver.quit();
		
	}

}
