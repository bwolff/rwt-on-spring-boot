package de.wolff.rwtonspringboot;

import org.eclipse.rap.rwt.testfixture.TestContext;
import org.junit.Rule;
import org.junit.Test;


public class RwtOnSpringBootApplicationTests {

	@Rule
	public TestContext rwtContext = new TestContext();

	@Test
	public void helloRwtTest() {
		// Create and run the EntryPoint is a unit test environment
		new HelloRwtOnSpringBootEntryPoint().createUI();

		System.out.println("I'm an RWT unit test!");
	}
}
