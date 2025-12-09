package datePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		
		
		WebDriver driver = new ChromeDriver(options);
		System.out.println("Opening Browser");
		driver.get("https://jqueryui.com/datepicker/#localization");
		System.out.println("Launching URL");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		//switching into frame
				WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
				driver.switchTo().frame(frame);
				System.out.println("Switching to frame");
		
		//Expected Date
		String date = "16";
		String month = "June";
		String year = "2024";
		
		WebElement dropDown = driver.findElement(By.id("locale"));
		Select s = new Select(dropDown);
		
		s.selectByVisibleText("English");
		System.out.println("Selecting Language from the dropdown");
		
		driver.findElement(By.id("datepicker")).click();
		System.out.println("Clicking on Calender");
		
		//Actual month and year
		while(true) {
			
			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(currentMonth.equals(month) && currentYear.equals(year))
			{
				System.out.println("Date is matched");
				break;
			}
			//selecting past date
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			
			//selecting future date
			
		}
		
		List<WebElement> list = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		
		//Select date
		for(WebElement alldates :list) {
			if(alldates.getText().equals(date)) {
				alldates.click();
				System.out.println("Selecting Required Date");
				break;
			}
		}
		Thread.sleep(5000);
		driver.close();
		System.out.println("Browser is closed");
		
		
	}

}
