package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByCssSelector {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		//driver.findElement(By.cssSelector("#type")).sendKeys("Pune");

		//driver.findElement(By.linkText("Terms")).click();
		driver.findElement(By.partialLinkText("Policy")).click(); //Privacy Policy & Cookies Policy ar avl.But it will display Privacy Policy
	}

}
