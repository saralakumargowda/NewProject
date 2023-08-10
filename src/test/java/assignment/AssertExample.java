package assignment;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertExample {
	@Test
	public void AssertExampleone() {

		String Expected = "Become a Seller";
		//String Actual = "Become a Seller";
		String Actual = "Become ";

		// Hard Assert
		// System.out.println("Before assert");
		// Assert.assertEquals(Actual, Expected);
		// System.out.println("Both strings are equal");
		// Assert.assertTrue(Expected.contains(Actual));
		// System.out.println("true");

		// Soft Assert
		System.out.println("Assert start");
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(Expected, Actual);
		soft.assertTrue(Expected.contains(Actual));
		System.out.println("Both the strings are not equal");

	}
}
