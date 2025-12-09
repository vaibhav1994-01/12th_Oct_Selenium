package list;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HW_List {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
		options.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select selectDay = new Select(day);
		Select selectMonth = new Select(month);
		Select selectYear = new Select(year);
		
		System.out.println("=== Checking Day Dropdown ===");
	    List<WebElement> dayOptions = selectDay.getOptions();
	    for (int i = 0; i < dayOptions.size(); i++) {
	    	selectDay.selectByIndex(i);
	    	System.out.println("Day Selected: " + dayOptions.get(i).getText());
	    	Thread.sleep(50);
	    }
	    
	    System.out.println("=== Checking Month Dropdown ===");
		 List<WebElement> monthOptions = selectMonth.getOptions();
		 for (int i = 0; i < monthOptions.size(); i++) {
		 selectMonth.selectByIndex(i);
		 System.out.println("Month Selected: " + monthOptions.get(i).getText());
		 Thread.sleep(50);   	
		
	    }
		System.out.println("=== Checking Year Dropdown ===");
	   List<WebElement> yearOptions = selectYear.getOptions();
	    for (int i = 0; i < yearOptions.size(); i++) {
		selectYear.selectByIndex(i);
		System.out.println("Year Selected: " + yearOptions.get(i).getText());
		Thread.sleep(50); 
}
	    System.out.println("All Dropdown Values Are Selectable");
	    
	    Thread.sleep(1500);
	    driver.close();
}
}

