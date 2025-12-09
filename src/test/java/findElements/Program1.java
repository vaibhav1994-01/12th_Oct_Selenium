package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {
	public static void main(String[] args) {
		//find element
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement SearchBox = driver.findElement(By.id("twotabsearchtextbox")); 
		SearchBox.sendKeys("Motorola"); //displays list of motorola products in search box.
		
		WebElement Ele = driver.findElement(By.xpath("//div[@class='left-pane-results-container']"));
		System.out.println(Ele.getText());
		System.out.println(Ele.getSize());
	}
}
