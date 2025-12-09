package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://testautomationcentral.com/demo/alerts.html");
		
		driver.findElement(By.xpath("//button[text()='Prompt']")).click();

		driver.findElement(By.xpath("(//button[contains(text(), 'Prompt')])[2]")).click();
		
		Alert myAlert = driver.switchTo().alert();
		
		myAlert.sendKeys("Kolhapur");
		
		Thread.sleep(2000);
		myAlert.accept();
		
		String s1 = driver.findElement(By.id("prompt-message")).getText();
		System.out.println(s1);
	}

}
