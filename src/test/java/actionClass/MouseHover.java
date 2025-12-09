package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		WebElement btn = driver.findElement(By.xpath("//span[contains(text(),'Account &')]"));
		Actions action = new Actions(driver);
		action.moveToElement(btn).build().perform();
		
		driver.findElement(By.xpath("//span[contains(text(),'Sign')]")).click();
		
		Thread.sleep(5000);
		
		driver.close();

	}

}
