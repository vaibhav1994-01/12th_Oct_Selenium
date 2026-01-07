package listeners;

import org.testng.annotations.Test;

public class LTestClass extends LTestListeners {

	@Test
	public void sampleTest() {
		System.out.println("This is a sample test method.");
	}
	
	@Test
	public void anotherTest() {
		System.out.println("This is another test method.");
		assert false; // This will cause the test to fail
	}
}
