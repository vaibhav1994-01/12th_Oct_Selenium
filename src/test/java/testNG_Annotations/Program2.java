package testNG_Annotations;

import org.testng.annotations. *; //importing all annotations from testng

public class Program2 {
	
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
	
	@Test
	public void testCase1() {
		int a = 5/0;
		System.out.println("Executing Test Case 1");
		System.out.println(a);
	}
	
	@Test
	public void testCase2() {
		System.out.println("Executing Test Case 2");
	}
	
	@Test
	public void testCase3() {
		System.out.println("Executing Test Case 3");
	}
	@Test
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
