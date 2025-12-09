package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe2 {

	public static void main(String[] args) {
		
		System.out.println("Launching Browser");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Launching URL");
		driver.get("https://demo.automationtesting.in/Frames.html");
		System.out.println("Maximizing Browser");
		driver.manage().window().maximize();
		
		System.out.println("Clicking on button");
		driver.findElement(By.xpath("//a[contains(text(),'Iframe with')]")).click();
		
		WebElement outerframe = driver.findElement(By.xpath("//div[@id='Multiple']//iframe"));
		System.out.println("Switching to outer frame");
		driver.switchTo().frame(outerframe);
		
		WebElement innerframe = driver.findElement(By.xpath("//html/body/section/div/div/iframe"));
		System.out.println("Switching to inner frame");
		driver.switchTo().frame(innerframe);
		System.out.println("Sending text to input box");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hi this is Vaibhav");
		
		System.out.println("Switching to outer frame");
		driver.switchTo().parentFrame();
		
		System.out.println("Reading text from outer frame");
		WebElement Text = driver.findElement(By.xpath("//h5[contains(text(),'Nested')]"));
		System.out.println(Text.getText());
		System.out.println("Closing Browser");
		
		driver.quit();
	}

}
