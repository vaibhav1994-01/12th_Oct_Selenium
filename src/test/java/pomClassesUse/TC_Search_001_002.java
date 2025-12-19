package pomClassesUse;

import pomClasses.BaseClass;
import pomClasses.HomePage;
import pomClasses.InvalidProduct;
import pomClasses.SamsungPage;

public class TC_Search_001_002 {
	public static void main(String[] args) throws InterruptedException {
		BaseClass base = new BaseClass();
		base.SetUp();
		base.LaunchURL();
		
		HomePage homePage = new HomePage(base.driver); 
		homePage.SearchProduct();
		System.out.println("Search hp");
		Thread.sleep(5000);
		
		SamsungPage samsungPage = new SamsungPage(base.driver);
		samsungPage.clear();
		samsungPage.SearchSamsungProduct();
		System.out.println("Search Samsung product on hp page");
		Thread.sleep(5000);

		InvalidProduct invalidProduct = new InvalidProduct(base.driver);
		invalidProduct.clear();
		invalidProduct.SearchInvalidProduct();
		System.out.println("Search invalid product on Samsung page");
		Thread.sleep(5000);
		
		base.tearDown();
	}
}
