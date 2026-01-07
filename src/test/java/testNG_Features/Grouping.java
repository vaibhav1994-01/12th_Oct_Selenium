package testNG_Features;

import org.testng.annotations.Test;

public class Grouping {

	@Test(groups = {"Login", "Smoke"})
	public void TestUserLogin() {
		System.out.println("Login Test Case");
	}
	
	@Test(groups = {"Search", "Regression"})
	public void ProductSearch() {
		System.out.println("Product Search Test Case");
	}
	
	@Test(groups = {"Cart", "Regression"})
	public void AddToCart() {
		System.out.println("Add to Cart Test Case");
	}
	
	@Test(groups = {"Checkout", "Regression"})
	public void Checkout() {
		System.out.println("Checkout Test Case");
	}
}
