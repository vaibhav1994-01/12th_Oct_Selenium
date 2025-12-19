package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	@FindBy(id = "input-email") public WebElement emailInput;
	@FindBy(id = "input-password") public WebElement passInput;
	@FindBy(xpath ="//input[@value='Login']") public WebElement LoginButton;
	@FindBy(partialLinkText = "Forgotten") public WebElement ForgottenPassLink;
	@FindBy(linkText = "Logout") public WebElement LogoutLink;
	
	public Login_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void TypeEmail() {
		emailInput.sendKeys("vaibhavgat108@gmail.com");
		System.out.println("Entering valid email id in the email input box on Login page");
	}
	public void TypePassword() {
		passInput.sendKeys("123456");
		System.out.println("Entering valid password in the password input box on Login page");
	}
	
	public void click_LoginButton() {
		LoginButton.click();
		System.out.println("Clicking on the Login button on Login page ");
	}
	public void TypeInvalidEmail() {
		emailInput.sendKeys("dfdsgd");
		System.out.println("Entering invalid email id in the email input box on Login page");
	}
	public void TypeInvalidPassword() {
		passInput.sendKeys("jyrujyuj");
		System.out.println("Entering invalid password in the password input box on Login page");
	}
	public void ForgottenPassword() {
		ForgottenPassLink.click();
		System.out.println("Clicking on the Forgotten Password link on Login page");
	}
	public void Logout() {
		LogoutLink.click();
		System.out.println("Clicking on the Logout link on Account page");
	}
}

