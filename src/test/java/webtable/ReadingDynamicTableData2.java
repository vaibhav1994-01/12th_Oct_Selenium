package webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingDynamicTableData2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dynamic-table");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
			
		// Finding Firefox Row
		WebElement ieRow = driver.findElement(
				By.xpath("//table[@class='table table-striped']/tbody/tr[td[text()='Firefox']]"));

		//Getting all columns from that row
		List<WebElement> ieColumns = ieRow.findElements(By.tagName("td"));
		
		System.out.println("Reading Firefox Row:");
		
		for (WebElement col : ieColumns) {
			System.out.print(col.getText() + " | ");
		}
		driver.close();

	}

}
