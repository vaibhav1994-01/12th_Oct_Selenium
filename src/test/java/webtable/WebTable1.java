package webtable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement row = driver.findElement(By.xpath("(//table[@id='product'])[1]//tr[5]"));
		//(//table[@id='product'])[1]") - locating table , //tr[5] - locating to table row 5
		// <tbody> - tag (table body) , <tr> - tag (table row)
		System.out.println(row.getText());
		driver.close();
	}

}
