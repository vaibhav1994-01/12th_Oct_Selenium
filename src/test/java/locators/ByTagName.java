package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ByTagName {

	public static void main(String[] args) {
ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.instagram.com/");
		List<WebElement> list = driver.findElements(By.tagName("a")); //expected links is 19.
		System.out.println("Count of links : " + list.size());
		
		for(WebElement ele:list) {
			System.out.println(ele.getText());
		}

	}

}
