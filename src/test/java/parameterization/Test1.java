package parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Test1 {
	
	WebDriver driver;
	
	@Parameters({"URL"})
	@BeforeMethod
	public void setup(String URL) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	}
	
	@Parameters({"SearchMobile","SearchLaptop"})
	@Test
	public void ProductSearch(String SearchMobile, String SearchLaptop) {
		driver.findElement(By.name("search")).clear();
		driver.findElement(By.name("search")).sendKeys(SearchMobile);
		driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
		System.out.println("Searching for mobile: " + SearchMobile);
		driver.findElement(By.xpath("(//i)[10]")).click(); 
		System.out.println("Navigated back to home page");
		
		driver.findElement(By.name("search")).clear();
		driver.findElement(By.name("search")).sendKeys(SearchLaptop);
		driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
		System.out.println("Searching for laptop: " + SearchLaptop);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
