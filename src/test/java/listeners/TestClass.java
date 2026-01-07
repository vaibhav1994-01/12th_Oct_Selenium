package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestClass extends TestListeners {
	WebDriver driver;

	 @BeforeMethod
	 public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/");
	 }

	@Test
	public void SearchTest1() {
		driver.findElement(By.name("search")).clear();
		driver.findElement(By.name("search")).sendKeys("samsung");
		driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
		System.out.println("Searching for mobile: samsung");

	}
	
	@Test
	public void SearchTest2() {
		driver.findElement(By.name("search")).clear();
		driver.findElement(By.name("search")).sendKeys("hp");
		driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
		System.out.println("Searching for laptop: hp");
		//assert false; // This will cause the test to fail
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
