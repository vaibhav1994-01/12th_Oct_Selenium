package pomClassesUse;

import pomClasses.BaseClass;
import pomClasses.HomePage;
import pomClasses.Home_icon;

public class TC_Home_007 {

	public static void main(String[] args) throws InterruptedException {
		BaseClass base = new BaseClass();
		base.SetUp();
		base.LaunchURL();
		
		HomePage homePage = new HomePage(base.driver);
		homePage.clickMacBook();
		Thread.sleep(2500);
		
		Home_icon home = new Home_icon(base.driver);
		home.click_homeIcon();
		Thread.sleep(2500);
		
		base.tearDown();
	}

}
