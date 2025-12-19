package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvalidProduct {
	@FindBy(xpath = "//input[@type='text']" ) //Locator of WebElement
	public WebElement invalidProduct_searchBox; //Variable(searchBox)
	
	@FindBy(xpath = "(//button[@type='button'])[4]") public WebElement searchButton; //Locator of search button
	
	
	public InvalidProduct(WebDriver driver) {
		PageFactory.initElements(driver,this);//this keyword is used to access webelements present in this class.
		
	}
	
	public void clear() {
		invalidProduct_searchBox.clear();
	}
	
	public void SearchInvalidProduct() {
		invalidProduct_searchBox.sendKeys("efigifiafie");
		searchButton.click();
	}
	
}
