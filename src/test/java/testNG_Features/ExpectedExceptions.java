package testNG_Features;

import org.testng.annotations.Test;

public class ExpectedExceptions {
	
	@Test(expectedExceptions = ArithmeticException.class) 
	public void LoginTest() {
		System.out.println("Test Case Start");
		System.out.println(15/0);
	}
	
	@Test(dependsOnMethods = "LoginTest") 
	public void HomePage() {
		System.out.println("Home Page Test");
	}
	
	 @Test(dependsOnMethods = "LoginTest")
	 public void Admin() {
		 System.out.println("Admin Page Test");
	 }
	
	 @Test(dependsOnMethods = "LoginTest")
	 public void Recruitment() {
		 System.out.println("Recruitment Page Test");
	 }
}

