package alerts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Alert1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://testautomationcentral.com/demo/alerts.html");
		
		driver.findElement(By.xpath("//button[text()='Alert']")).click();
		
		driver.findElement(By.xpath("//button[text()='Show Alert']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		
				File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				String imageName = "Alert1Demo"; 
				
				
				String path = System.getProperty("user.dir") + "\\Screenshot\\";
				
				
				File screenshotFolder = new File(path);
				
				if(!screenshotFolder.exists())
				{
					screenshotFolder.mkdir();
				}
				File destn = new File(path + imageName + ".png");
				FileHandler.copy(source, destn);
				driver.quit();
	}

}
