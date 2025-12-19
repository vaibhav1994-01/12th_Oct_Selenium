package pomClassesUse;

import pomClasses.BaseClass;
import pomClasses.HomePage;

public class TC_RegAccount_010 {
	public static void main(String[] args) throws InterruptedException {
		BaseClass base = new BaseClass();
		base.SetUp();
		base.LaunchURL();
		
		HomePage MyAccount = new HomePage(base.driver);
		MyAccount.click_MyAccount();
		Thread.sleep(2000);
		
		MyAccount.click_Register();
		Thread.sleep(2000);
		
		MyAccount.click_Continue();
		Thread.sleep(2000);
		
		base.tearDown();
	}
}
