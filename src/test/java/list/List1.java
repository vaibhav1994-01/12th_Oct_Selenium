package list;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class List1 {

	public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
		options.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		driver.findElement(By.id("day")).click();
		driver.findElement(By.xpath("(//option[contains(text(),'10')])[1]")).click();
		
		driver.findElement(By.id("month")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Aug')]")).click();
		
		driver.findElement(By.id("year")).click();
		driver.findElement(By.xpath("//option[contains(text(),'1995')]")).click();
		
		

	}

}
