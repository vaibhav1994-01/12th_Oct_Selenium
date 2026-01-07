package testNG_Features;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(priority=1, invocationCount = 4)//Test case will be executed 4 times
	public void LoginTest() {
		System.out.println("Test Case Start");
	
	}
	@Test(priority=2,invocationCount = 2)//Test case will be executed 2 times
	public void HomePage() {
		System.out.println("Home Page Test");
	}
	
	 @Test(priority=3,groups = "Admin")
	 public void Admin() {
		 System.out.println("Admin Page Test");
	 }
	
	 @Test(priority=4,enabled = false) 
	 public void Recruitment() {
		 System.out.println("Recruitment Page Test");
	 }
}
