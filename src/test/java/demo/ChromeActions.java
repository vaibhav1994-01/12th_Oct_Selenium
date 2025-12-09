package demo;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ChromeActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); //launching browser
		//WebDriver driver = new EdgeDriver();
		//WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize(); // maximizing browser
		//driver.get("https://www.youtube.com/");// launching url
		//Thread.sleep(5000);
		driver.navigate().to("https://www.facebook.com/"); //launch facebook
		
		//driver.navigate().back(); //moves back to youtube
		//driver.navigate().forward(); //moves forward to facebook
		
		//Thread.sleep(5000);
	    //driver.navigate().refresh(); //refresh page
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,50)");
		
		String title =driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//driver.manage().window().minimize();
		//driver.switchTo().newWindow(WindowType.TAB); //open new tab
		
		Thread.sleep(10000);
		//driver.quit(); //closing browser
		//driver.close();// closing current tab
	}

}
