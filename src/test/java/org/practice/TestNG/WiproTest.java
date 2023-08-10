package org.practice.TestNG;

import org.testng.annotations.Test;
import org.yantra.genericUtility.BaseClass;
import org.yantra.genericUtility.IpathConstants;

public class WiproTest extends BaseClass{
	@Test
	
	public void itWebsite()
	{
		excelUtility.initializeExcelfile(IpathConstants.YANTRAEXCELPATH);
		System.out.println("Amazon logged in successfully");
}
}
