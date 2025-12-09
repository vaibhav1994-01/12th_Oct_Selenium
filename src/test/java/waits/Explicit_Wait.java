package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		
		// creating explicit wait object
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		
		// waiting until this element is getting load
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Sign Up']")));
		
		//WebElement signUp = driver.findElement(By.xpath("//a[text()='Sign Up']"));
		//wait.until(ExpectedConditions.visibilityOf(signUp));
		
		driver.close();
	}

}
