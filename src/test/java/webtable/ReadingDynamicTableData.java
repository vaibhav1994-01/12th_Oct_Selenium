package webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingDynamicTableData {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dynamic-table");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
			
		// Finding Internet Explorer Row
	//	WebElement ieRow = driver.findElement(
	//			By.xpath("//table[@class='table table-striped']/tbody/tr[td[contains(text(), 'Internet Explorer')]]"));

		//Getting all columns from that row
	//	List<WebElement> ieColumns = ieRow.findElements(By.tagName("td"));
		
	//  System.out.println("Reading Internet Explorer Row:");
		
	//	for (WebElement col : ieColumns) {
	//		System.out.print(col.getText() + " | "); //Printing statement without ln,data printed horizantally.
		
	//		}

	//	Reading all table data using nested forLoop.
	//	all rows data located & stored in rows variable.
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr"));
		
	//loop throgh each row	
		for(int i=1; i<=rows.size(); i++) {
			
	//	all column data located & stored in column variable.	
		List<WebElement> column = driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr["+ i +"]/td"));
		System.out.println();
			
	// loop through each column
		for(int j=1;j<=column.size();j++) {
			
			//Data reading steps - (1st row 1st col)-(4th row 1st col) then (1st row 2nd col)-(4th row 2nd col) upto (4th row 4th col)
			WebElement cell = driver.findElement(
					By.xpath("//table[@class='table table-striped']/tbody/tr["+ i +"]/td["+ j +"]"));
			
			System.out.print(cell.getText() + " | ");
		}
		
		System.out.println();
		}
		driver.close();
	}

}
