package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SamsungPage extends BaseClass {
	@FindBy(xpath = "//input[@type='text']" ) //Locator of WebElement
	public WebElement searchBox; //Variable(searchBox)
	
	@FindBy(xpath = "(//button[@type='button'])[4]") public WebElement searchButton; //Locator of search button
	
	
	public SamsungPage(WebDriver driver) {
		PageFactory.initElements(driver,this);//this keyword is used to access webelements present in this class.
		
	}
	
	public void SearchSamsungProduct() {
		searchBox.clear();
		searchBox.sendKeys("Samsung SyncMaster 941BW");
		searchButton.click();
	}
}
