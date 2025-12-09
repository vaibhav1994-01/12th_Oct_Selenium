package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathUsingIndexing {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[1]")).click();
		System.out.println("Clicking on Home button");
		
		Thread.sleep(5000);
		driver.close();

	}

}
