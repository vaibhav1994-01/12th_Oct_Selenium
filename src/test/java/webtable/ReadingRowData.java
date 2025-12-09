package webtable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingRowData {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//Reading row data in specific column (/td[2] - column 2) <td> - tag (table data)
		WebElement td2 = driver.findElement(By.xpath("(//table[@id='product'])[1]//tr[3]/td[2]"));
		System.out.println(td2.getText());
	}

}
