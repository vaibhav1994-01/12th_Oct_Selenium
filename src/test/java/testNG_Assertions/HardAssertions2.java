package testNG_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions2 {
	
	@Test
	public void hardAssertExample() {

	    System.out.println("Step 1");

	    Assert.assertEquals(15, 25);  // ❌ FAIL

	    System.out.println("Step 2"); // ❌ Will NOT execute
	}

	
}
