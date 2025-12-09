package windowHandle;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Thread.sleep(2500);
		
		Set<String> windowsId = driver.getWindowHandles();
		Iterator<String> it = windowsId.iterator();
		
		String parentWindow = it.next();
		String childWindow = it.next();
		
		//getting window title using for each loop
		for(String wind:windowsId) {
			@Nullable
			String title = driver.switchTo().window(wind).getTitle();
			System.out.println(title);
		}
		driver.quit();

	}

}
