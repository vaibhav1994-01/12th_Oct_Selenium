package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Button_Table_SS {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		//Different method for capturing screenshot
	//	TakesScreenshot ts = (TakesScreenshot) driver;
	//	File SourceFile = ts.getScreenshotAs(OutputType.FILE);
		
	//	String s = "Screenshot1";
	//	File target = new File (System.getProperty("user.dir") + "\\Screenshot\\" + s + ".png");
	//	FileHandler.copy(SourceFile, target);
		
		//Capturing screenshot of specific button
	//	WebElement button = driver.findElement(By.id("confirmbtn"));
	//	File SourceFile = button.getScreenshotAs(OutputType.FILE);
	//	String s = "Confirm Button";
	//   File target = new File(System.getProperty("user.dir") + "\\Screenshot\\" + s + ".png");
	//   FileHandler.copy(SourceFile, target);
	    
	    //Locating Table by using ScrollIntoView to Capture screenshot of Specific table
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   WebElement table = driver.findElement(By.xpath("(//table[@id='product'])[2]"));
	   
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   js.executeScript("arguments[0].scrollIntoView(true);",table);
	    
	   File SourceFile = table.getScreenshotAs(OutputType.FILE);
	   String s = "Table 2";
	   File target = new File(System.getProperty("user.dir") + "\\Screenshot\\" + s + ".png");
	   FileHandler.copy(SourceFile, target);
	   
	   driver.close();
	}

	

}
