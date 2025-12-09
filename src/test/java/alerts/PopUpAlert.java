package alerts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PopUpAlert {

	public static void main(String[] args) {
		ChromeOptions options1 = new ChromeOptions();
		options1.addArguments("--start-maximized");
		options1.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(options1);
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		System.out.println("Pop Up is Closed");
		
		driver.close();
	}

}
