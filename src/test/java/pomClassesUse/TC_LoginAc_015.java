package pomClassesUse;

import pomClasses.BaseClass;
import pomClasses.HomePage1;
import pomClasses.Login_Page;

public class TC_LoginAc_015{
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
	login.TypeInvalidEmail();
	Thread.sleep(2000);
	login.TypeInvalidPassword();
	Thread.sleep(2000);
	login.click_LoginButton();
	Thread.sleep(2000);
	
	base.tearDown();
}
}
