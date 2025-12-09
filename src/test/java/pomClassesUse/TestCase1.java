package pomClassesUse;

import pomClasses.BaseClass;
import pomClasses.HomePage;

public class TestCase1 {

	public static void main(String[] args) {
		BaseClass base = new BaseClass();
		HomePage homePage = new HomePage(null);
		
		base.SetUp();
		base.LaunchURL();
		homePage.SearchProduct();
	}

}
