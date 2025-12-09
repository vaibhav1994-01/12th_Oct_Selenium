package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ById {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
	//	driver.findElement(By.id("u_0_8_Iq")).sendKeys("Vaibhav"); //as id changes,error is occured.
		
		driver.findElement(By.xpath("//input[contains(@id, 'u_0_8')]")).sendKeys("Vaibhav");
		
		Thread.sleep(10000);
		driver.quit();
	}

	}


