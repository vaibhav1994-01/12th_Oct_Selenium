package list;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class list2 {

	public static void main(String[] args) throws InterruptedException {
		  ChromeOptions options = new ChromeOptions();
	        options.addArguments("--incognito");
			options.addArguments("--start-maximized");
			
			WebDriver driver = new ChromeDriver(options);
			driver.get("https://www.facebook.com/r.php?entry_point=login");
			
			WebElement day = driver.findElement(By.id("day"));
			WebElement month = driver.findElement(By.id("month"));
			WebElement year = driver.findElement(By.id("year"));
			
			Select l1 = new Select(day);
			l1.selectByIndex(8);
			
			Select l2 = new Select(month);
			l2.selectByContainsVisibleText("Jun");
			
			Select l3 = new Select(year);
			l3.selectByValue("2000");
			
			Thread.sleep(5000);
			driver.close();
	}

}
