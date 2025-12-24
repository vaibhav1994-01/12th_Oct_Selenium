package testNG_Annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//main method not required in testNG.
//program is executed by using annotations only.

 public class Program1 {
 WebDriver driver;

 @BeforeMethod
 public void setup() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}
 
 @Test
 private void pageTitle() {
	 String title = driver.getTitle();
	 System.out.println("Page Title: " + title);
 }
 
 @Test
 public void verifyCompanyLogo() {
	 boolean logoDisplayed = driver.findElement(org.openqa.selenium.By.xpath("//div[@class='orangehrm-login-branding']//img")).isDisplayed();
	 System.out.println("Is Company Logo Displayed: " + logoDisplayed);
 }
 
 @AfterMethod
 public void tearDown() {
	 driver.quit();
 }
 
}