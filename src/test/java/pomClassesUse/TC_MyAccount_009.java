package pomClassesUse;

import pomClasses.BaseClass;
import pomClasses.HomePage1;
import pomClasses.Login_Page;

public class TC_MyAccount_009 {

	public static void main(String[] args) throws InterruptedException {
		BaseClass base = new BaseClass();
		base.SetUp();
		base.LaunchURL();
		
		HomePage1 MyAccount = new HomePage1(base.driver);
		MyAccount.click_MyAccount();
		Thread.sleep(2000);
		MyAccount.click_Login();
		Thread.sleep(2000);
		
		base.tearDown();

	}

}
