package testNG_Features;

import org.testng.annotations.Test;

public class DependsOnMethods {
	
	@Test
	public void LoginTest() {
		System.out.println("Test Case Start");
		System.out.println(15/0);
	}
	@Test(dependsOnMethods = "LoginTest") // This test will be skipped if LoginTest fails
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