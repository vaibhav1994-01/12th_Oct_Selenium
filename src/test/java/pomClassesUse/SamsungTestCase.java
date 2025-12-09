package pomClassesUse;

import pomClasses.BaseClass;
import pomClasses.SamsungPage;

public class SamsungTestCase {
	public static void main(String[] args) {
		BaseClass base = new BaseClass();
		SamsungPage SamsungPage = new SamsungPage(null);
		
		base.SetUp();
		base.LaunchURL();
		SamsungPage.SearchSamsungProduct();
	}
}
