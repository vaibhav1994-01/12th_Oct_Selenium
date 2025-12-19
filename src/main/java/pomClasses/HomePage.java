package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass { //(Acquiring properties of other class) Inheritance - single level inheritance
	@FindBy(xpath = "//input[@type='text']" ) //Locator of WebElement
	public WebElement searchBox; //Variable(searchBox)
	
	@FindBy(xpath = "(//button[@type='button'])[4]") public WebElement searchButton; //Locator of search button
	@FindBy(linkText = "MacBook") public WebElement MacBookLink;
	@FindBy(xpath = "(//a[@class='dropdown-toggle'])[1]") public WebElement MyAccount;
	@FindBy(linkText = "Register") public WebElement Register;
	@FindBy(xpath ="//input[@type='submit']") public WebElement Continue;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);//this keyword is used to access webelements present in this class.
		}
	public void SearchProduct() {
		searchBox.clear();
		searchBox.sendKeys("hp");
		searchButton.click();
	}
	public void clickMacBook() {
		MacBookLink.click();
		System.out.println("Clicking on the Macbook link on homepage");
	}
	public void click_MyAccount() {
		MyAccount.click();
		System.out.println("Clicking on the My Account option on home page ");
	}
	public void click_Register() {
		Register.click();
		System.out.println("Clicking on the Register option under My Account ");
	}
	public void click_Continue() {
		Continue.click();
		System.out.println("Clicking on the Continue option on Register page ");
	}
}


