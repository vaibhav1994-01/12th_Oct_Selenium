package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByName {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
	//	WebElement firstname = driver.findElement(By.name("firstname"));
	//	firstname.sendKeys("Vaibhav");
		
		driver.findElement(By.name("firstname")).sendKeys("Vijay");
		Thread.sleep(10000);
		driver.quit();
	}

}
