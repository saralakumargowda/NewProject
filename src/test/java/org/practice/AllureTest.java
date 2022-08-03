package org.practice;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class AllureTest {
	@Description("Aluure test project")
	@Severity(SeverityLevel.CRITICAL)
	@Test
public void allurtest()
{
	System.out.println("Allure execution");
	System.out.println("Allure execution2");
	
}
}
