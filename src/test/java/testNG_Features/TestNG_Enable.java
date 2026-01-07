package testNG_Features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestNG_Enable {
	WebDriver driver;

	 @BeforeClass
	 public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	 }
		@BeforeMethod
		public void OpenApplication() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
		@Test(enabled = true)
		public void Logo() {
			driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		}
	
	 @Test(enabled = false) // This test will be skipped
	 public void VerifyUsernameAndPassword() {
		 driver.findElement(By.name("username")).isDisplayed();
		 driver.findElement(By.name("password")).isDisplayed();
		 System.out.println("Username and Password fields are displayed");
	 }
	 
	 @Test //By default enabled = true
	 public void HomePage() {
		 System.out.println("Homepage");
	 }
	 
	 @Test
	 public void Dashboard1() {
		 System.out.println("Dashboard1");
	 }
	 
	 @Test
	 public void Dashboard2() {
		 System.out.println("Dashboard2");
	 }
	 
	 @AfterClass
	 public void tearDown() {
		 driver.quit();
	 }
}
