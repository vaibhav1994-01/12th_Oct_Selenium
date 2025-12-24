package testNG_Keywords;

import org.testng.annotations.*;

public class TestNGKeywords1 {
	
//Smoke,Regression Test run through TestNG XML file
	
	@Test(groups = "Smoke", enabled = true)
	public void testCase1() {
		System.out.println("Executing Test Case 1");
		
	}
	
	@Test(groups = "Regression", enabled = true)
	public void testCase2() {
		System.out.println("Executing Test Case 2");
	}
	
	@Test(groups = "Regression", enabled = true)  
	public void testCase3() {
		System.out.println("Executing Test Case 3");
	}
	@Test(groups = "Smoke", enabled = true)
	public void testCase4() {
		System.out.println("Executing Test Case 4");
	}
	
}
