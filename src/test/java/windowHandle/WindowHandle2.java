package windowHandle;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
//		String win1 = driver.getWindowHandle();
//		System.out.println(win1);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Thread.sleep(2500);
//		String win2 = driver.getWindowHandle();
//		System.out.println(win2);
		
		//return a set of window handles which can be used to iterate over all active windows 
		Set<String> windowsId = driver.getWindowHandles();
	//	System.out.println(windowsId);
	//	Iterator<String> it = windowsId.iterator();
		
//		String parentWindow = it.next();
//		String childWindow = it.next();
//		
//		System.out.println("This is parent window : " + parentWindow);
//		System.out.println("This is child window : " + childWindow);
		
		//shift focus to child window
//		driver.switchTo().window(childWindow);
//		@Nullable
//		String actualTitle = driver.getTitle();
//		System.out.println("This is child window title : " + actualTitle);
		
		//now again shift focus back to parent window
//		driver.switchTo().window(parentWindow);
//		System.out.println("This is parent window title : " + driver.getTitle());
		
		//To verify test case pass/fail using if-else statement.
//		String expectedTitle = "Human Resources Management Software | HRMS | OrangeHRM";
//		
//		if(actualTitle.equals(expectedTitle)) {
//			System.out.println("Test case pass");
//		}
//		else {
//			System.out.println("Test case fail");
//		}
		
		//getting parent and child window id by using arraylist.
		List<String> Winlist = new ArrayList<String>(windowsId);
		
		String parentwindow = Winlist.get(0);
		String childwindow = Winlist.get(1);
		System.out.println("This is parent window id : " +parentwindow);
		System.out.println("This is child window id : " +childwindow);
		
		//shift focus to child window and get title.
		driver.switchTo().window(childwindow);
		@Nullable
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		driver.quit();
	}

}
