package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bigbasket.com/");
		
		Thread.sleep(5000);
		
		List<WebElement> items = driver.findElements(By.xpath("//ul[@class='flex justify-start min-w-full p-0']/li"));
		System.out.println("Total items: " + items.size()); //Total items from selected unordered list(ul)
		driver.quit();
	}

}
