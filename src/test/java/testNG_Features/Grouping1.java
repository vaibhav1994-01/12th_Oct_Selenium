package testNG_Features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Grouping1 {
	WebDriver driver;

	 @BeforeClass
	 public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	 @Test(groups = ("LoginPage"))
	 public void VerifyUsernameAndPassword() {
		 driver.findElement(By.name("username")).isDisplayed();
		 driver.findElement(By.name("password")).isDisplayed();
		 System.out.println("Username and Password fields are displayed");
	 }
	 
	 @Test(groups = ("HomePage"))
	 public void HomePage() {
		 System.out.println("Homepage");
	 }
	 
	 @Test(groups = ("Dashboard"))
	 public void Dashboard1() {
		 System.out.println("Dashboard1");
	 }
	 
	 @Test(groups = ("Dashboard"))
	 public void Dashboard2() {
		 System.out.println("Dashboard2");
	 }
	 
	 @AfterClass
	 public void tearDown() {
		 driver.quit();
	 }
}
