package pomClassesUse;

import pomClasses.AddToCart;
import pomClasses.BaseClass;

public class TC_AddToCart_003To006 {
	public static void main(String[] args) throws InterruptedException {
		BaseClass base = new BaseClass();
		base.SetUp();
		base.LaunchURL();
		
		AddToCart add = new AddToCart(base.driver);
		add.click_iPhone();
		Thread.sleep(2500);
		
		add.clear_QtyInputBox();
		//add.input_Quantity();
		add.input_InvalidQuantity();
		Thread.sleep(2500);
		
		add.click_AddToCart();
		Thread.sleep(2500);
		
		add.click_ShoppingCart();
		Thread.sleep(2500);
		
		
		base.tearDown();
	}
}
