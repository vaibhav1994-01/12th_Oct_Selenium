package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_icon {
@FindBy(xpath = "(//i)[10]") public WebElement homeIcon; //MacBook page

public Home_icon(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public void click_homeIcon() {
	homeIcon.click();
	System.out.println("Clicking on the home icon on MacBook page");
}
}