package assignment;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class AssertSimple {
	@Test
	public void SampleAssert() {
		String Expected="Please identify the name";
		String Actual="Please";
		
		//Hard Assert
//		System.out.println("Before assert");
//		Assert.assertEquals(Actual, Expected);
		System.out.println("Both strings are equal");
		Assert.assertTrue(Expected.contains(Actual));
		System.out.println("true");
		
		//Soft Assert
		System.out.println("Assert start");
		SoftAssert soft= new SoftAssert();
		soft.assertEquals(Expected, Actual);
		soft.assertTrue(Expected.contains(Actual));
		System.out.println("Both the strings are not equal");
		
	}

}
