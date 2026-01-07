package testNG_DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DATAProvider {
	WebDriver driver;

		 @BeforeTest
		 public void setup() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		 }
			@BeforeClass
			public void OpenApplication() {
			driver.get("https://tutorialsninja.com/demo/");
		}
			@BeforeMethod
			public void NavigateToLogin() {
			driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]")).click();
			driver.findElement(By.linkText("Login")).click();
			
			}
			
			@Test(dataProvider = "LoginData")
			public void LoginTest(String email, String password) {
				driver.findElement(By.id("input-email")).clear();
				driver.findElement(By.id("input-email")).sendKeys(email);
				
				driver.findElement(By.id("input-password")).clear();
				driver.findElement(By.id("input-password")).sendKeys(password);
				
				driver.findElement(By.xpath("//input[@value='Login']")).click();
				
			}
			
			@DataProvider(name = "LoginData")
			public Object[][] testData() {
				Object[][] data = new Object[4][2];
				data[0][0] = "xyz@gmail.com"; data[0][1] = "123456"; 
				System.out.println("Login with Invalid Email & Valid Password");
				
				data[1][0] = "vaibhavgat108@gmail.com"; data[1][1] = "wrongpassword";
				System.out.println("Login with Valid Email & Invalid Password");
				
				data[2][0] = "xyz@gmail.com"; data[2][1] = "wrongpassword";
				System.out.println("Login with Invalid Credentials");
				
				data[3][0] = "vaibhavgat108@gmail.com"; data[3][1] = "123456";
				System.out.println("Login with valid credentials");
				
				return data;
			}
			
			@AfterTest
			public void tearDown() {
			driver.quit();
				
			}
}
			


			
			
			
			
			
			
			
			
			
			
			

