package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SendKeysandClickMethods {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		WebElement id = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		//js.executeAsyncScript("arguments[0].value='"+"Vaibhav@gmail.com"+"';", id);
		js.executeAsyncScript("arguments[0].value='"+"Vaibhav@456"+"';", pass);
		
		Thread.sleep(2000);

}
}