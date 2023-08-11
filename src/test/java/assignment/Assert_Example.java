package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Assert_Example {
	public static WebDriver driver;

	@BeforeClass(alwaysRun = true)
	@Parameters("browser")
	public void Beforeclass() {
		System.out.println("Test scripts starts");
	}

	@BeforeMethod(alwaysRun = true)
	@Parameters("browser")

	public void Beforemethod() {
		System.out.println("Test scripts executes");
	}

	@Test
	public void AssertExampleone1() {

		String Expected = "Create Type of Work";
		String Actual = "Create Type of Work";

		System.out.println("Before assert");
		Assert.assertEquals(Actual, Expected);
		System.out.println("Both strings are equal");
		Assert.assertTrue(Expected.contains(Actual));
		System.out.println("true");
	}

//		 
		//driver.findElement(
//				By.xpath("//div[@class='popup_menu_button popup_menu_button_settings  popup_menu_button_pressed']"))
//				.click();
//		driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
//
//		String txt = driver.findElement(By.xpath("//span[text()='Create Type of Work']")).getText();
//		System.out.println(txt);
//		driver.quit();
		
	@FindBy(xpath="//div[@class='popup_menu_button popup_menu_button_settings  popup_menu_button_pressed']") private WebElement popup;

	public void AssertExampleone1(WebDriver driver) {
		PageFactory.initElements(driver, this);
		Assert_Example.driver = driver;
	}

	public void clickonbutton() {
		popup.click();

	}
	
	@FindBy(xpath="//a[text()='Types of Work']") private WebElement work;

	public void AssertExampleone11(WebDriver driver) {
		PageFactory.initElements(driver, this);
		Assert_Example.driver = driver;
	}

	public void clickonwork() {
		work.click();

	}
	@FindBy(xpath="//span[text()='Create Type of Work']") private WebElement typework;

	public void AssertExampleone111(WebDriver driver) {
		PageFactory.initElements(driver, this);
		Assert_Example.driver = driver;
	}

	public void clickontypework() {
		typework.click();

	}
	@AfterMethod(alwaysRun = true)
	@Parameters("browser")
	public static void after1() {
		System.out.println("After method logout the application");
	}

	@AfterClass(alwaysRun = true)
	@Parameters("browser")
	public static void afterClass() {
		System.out.println("After class close the driver");
		
		System.out.println("After class close the driver");
		
	}

}
