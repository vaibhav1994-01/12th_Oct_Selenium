package windowHandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		
		// switch to other active window.
		String win1 = driver.getWindowHandle();
		System.out.println(win1); //returns unique window id which can be used to switch to window.
		
		driver.close();
		//unique window id(changes every time)
		//0D267ADB870E8C31C69DF744ED872BAA
		//676225551B2941A14B9EBD39BAF561BE

	}

}
