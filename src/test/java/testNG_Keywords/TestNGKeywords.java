package testNG_Keywords;

import org.testng.annotations.*; 

public class TestNGKeywords {
	@BeforeSuite
	public void setupDB() {
		System.out.println("DB connection established");
	}
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("Launching Browser");
	}
	
	@BeforeClass
	public void launching_URL() {
		System.out.println("Launching URL");
	}
	
	@BeforeMethod
	public void loginToApp() {
		System.out.println("Login to the application");
	}
	
	@Test(priority=2)
	public void testCase1() {
		int a = 5/5;
		System.out.println("Executing Test Case 1");
		System.out.println(a);
	}
	
	@Test(priority=1)
	public void testCase2() {
		System.out.println("Executing Test Case 2");
	}
	
	@Test(priority=5) //skips priority 4 as it is not defined and executes last 
	public void testCase3() {
		System.out.println("Executing Test Case 3");
	}
	@Test(priority=-2) //executes first because -2 is smaller than others
	public void testCase4() {
		System.out.println("Executing Test Case 4");
	}
	
	@AfterMethod
	public void logoutFromApp() {
		System.out.println("Logout from the application");
	}
	
	@AfterClass
	public void closing_CurrentTab() {
		System.out.println("Closing Tab");
	}
	@AfterTest
	public void closing_Browser() {
		System.out.println("Closing Browser");
	}
	
	@AfterSuite
	public void closeDB() {
		System.out.println("DB connection closed");
	}
}
