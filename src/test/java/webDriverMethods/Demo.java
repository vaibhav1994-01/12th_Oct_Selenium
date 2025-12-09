package webDriverMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		boolean s1 = driver.findElement(By.id("checkbox2")).isSelected(); //false
		System.out.println(s1);
		driver.findElement(By.id("checkbox2")).click();
		boolean s2 = driver.findElement(By.id("checkbox2")).isSelected(); //true
		System.out.println(s2);
		
		boolean heading = driver.findElement(By.xpath("//h1")).isDisplayed();
		
		System.out.println(heading);

		String hd = driver.findElement(By.xpath("//h1")).getText();
		System.out.println(hd);
	}

}
