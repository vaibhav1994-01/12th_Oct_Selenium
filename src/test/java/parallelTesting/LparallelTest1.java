package parallelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class LparallelTest1 {

	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.out.println("Before method - Setup method in Parallel Test 1");
		driver = new ChromeDriver();
	}
	
	@Test
	public void testMethod1() {
		System.out.println("Executing Test Method 1 in Parallel Test 1");
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("Executing Test Method 2 in Parallel Test 1");
		driver.get("https://www.facebook.com/");
	}
	
	@Test	
	public void testMethod3() {
		System.out.println("Executing Test Method 3 in Parallel Test 1");
		driver.get("https://www.flipkart.com/");
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("After method - Tear down method in Parallel Test 1");
		driver.quit();
	}
}
