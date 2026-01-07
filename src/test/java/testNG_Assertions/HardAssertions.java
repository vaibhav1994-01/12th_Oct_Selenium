package testNG_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {

	@Test
	public void TestCase1() {
		System.out.println("Program Start");
		boolean actualresult = false;
		
		Assert.assertFalse(actualresult, "Assertion Failed - Test Data is not Valid");
		System.out.println("Program End");
	}
}
