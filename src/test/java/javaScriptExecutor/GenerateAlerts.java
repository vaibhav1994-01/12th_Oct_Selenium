package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GenerateAlerts {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		
		GenerateAlerts.GenerateAlert1(driver, "Welcome to Facebook");
		Thread.sleep(5000);
		driver.close();

	}
	
	public static void GenerateAlert1(WebDriver driver, String message) {
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("alert('"+ message +"')");
	}

}
