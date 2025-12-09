package screenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_DateTime {
	
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		
		//Giving name of screenshot as projectname_dateAndtime
		String ProjectName = "Amazon_";
		//Steps for generating a timestamp String are, 1st import class SimpleDateFormat, then .format - import class Date(), then store in a variable.
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()); 
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File path = new File(System.getProperty("user.dir") + File.separator + "Screenshot" + File.separator+ProjectName+timeStamp+".png");
		
		FileHandler.copy(src, path);
		
		driver.close();
}
}
