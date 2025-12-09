package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert3 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://testautomationcentral.com/demo/alerts.html");
		
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();

		driver.findElement(By.xpath("(//button[contains(text(),'Confirm')])[2]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		
		String s1 = driver.findElement(By.id("confirm-message")).getText();
		System.out.println(s1);

	}

}
