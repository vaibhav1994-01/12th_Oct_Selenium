package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Highlighting {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		
		WebElement image = driver.findElement(By.xpath("//img[@alt='Facebook']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='15px solid purple'", image);
		Thread.sleep(5000);
		
		js.executeScript("arguments[0].style.background='pink'", image);
		Thread.sleep(5000);
		driver.close();
		
	}

}
