package pomClassesUse;

import pomClasses.BaseClass;
import pomClasses.HomePage1;
import pomClasses.Login_Page;

public class TC_LoginAc_014_017 {
	public static void main(String[] args) throws InterruptedException {
		BaseClass base = new BaseClass();
		base.SetUp();
		base.LaunchURL();
		
		HomePage1 MyAccount = new HomePage1(base.driver);
		MyAccount.click_MyAccount();
		Thread.sleep(2000);
		MyAccount.click_Login();
		Thread.sleep(2000);
		
		Login_Page login = new Login_Page(base.driver);
		login.TypeEmail();
		Thread.sleep(2000);
		login.TypePassword();
		Thread.sleep(2000);
		login.click_LoginButton();
		Thread.sleep(2000);
		
		login.Logout();
		Thread.sleep(2000);
		
		base.tearDown();
		

	}
}
