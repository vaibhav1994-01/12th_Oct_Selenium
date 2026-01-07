package parallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class ParallelTesting {
//Use ThreadLocal so tests can run in parallel with separate WebDriver instances
private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

private WebDriver Driver() { // Getter method to access the WebDriver instance for the current thread
	return driver.get(); 
}
	
@BeforeMethod
public void setup() {
	WebDriver webDriver = new ChromeDriver();
	webDriver.manage().window().maximize();
	webDriver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	driver.set(webDriver); // Set the WebDriver instance for the current thread
}
	
	@Test
	public void Demosite1() {
		
		Driver().get("https://tutorialsninja.com/demo/");
		Driver().findElement(By.name("search")).sendKeys("samsung");
		Driver().findElement(By.xpath("(//button[@type='button'])[4]")).click();
		System.out.println("Searching for mobile on Demosite1 parallely on same browser");
	}
	
	@Test
	public void Demosite2() { 
		Driver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Driver().findElement(By.name("username")).sendKeys("Admin");
		Driver().findElement(By.name("password")).sendKeys("admin123");
		System.out.println("Performing Login on Demosite2 parallely on same browser");	
	}
	
	@Test	
	public void Youtube() {
		Driver().get("https://www.youtube.com/");
		System.out.println("Navigating to Youtube parallely on same browser");
	}
	
	@AfterMethod
	public void tearDown() {
	    WebDriver webDriver = Driver();
	    if (webDriver != null) {
	        webDriver.quit();
	        driver.remove();
	    }
	}

}

	

