package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Frame1 {

	public static void main(String[] args) throws InterruptedException {
		//using headless option (browser will not open, but operation will be performed in backend).
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

	//Webelement is on frame, 1st we need to locate element then we have to switch to element.	
		WebElement frameEle = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frameEle);
	
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		System.out.println("Button is clicked");
	//	Thread.sleep(5000);
	//	driver.close();
		
	// Now locating web element on web page by switching from frame to web page.
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("getwebsitebtn")).click();
		System.out.println("Get your website button is clicked");
		Thread.sleep(5000);
		driver.quit();
	}

}
