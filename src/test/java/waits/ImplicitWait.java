package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ImplicitWait {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		driver.findElement(By.id("email")).sendKeys("Test");
		driver.findElement(By.id("pass2")).sendKeys("Test"); //id entered is wrong so it throws NoSuchElementException
	}

}
