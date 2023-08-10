package org.yantra.genericUtility;

import org.openqa.selenium.WebDriver;
import org.shopping_portal.objectRepository.ActiTimeLoginPage;
import org.shopping_portal.objectRepository.LoginPagevtiger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass extends  InstanceClass {
	public static WebDriver listenerdriver; 
	protected static WebDriver driver;
	/**
	 * This method used to open browser and Url
	 */
	//public static WebDriver Listenerdriver;
	
	@Parameters("browser")
	@BeforeClass(alwaysRun=true)
	public void classSetup(String browser) {
		// Create object for Generic utility
		excelUtility = new ExcelUtility();
		javaUtility = new JavaUtility();
		fileUtility = new FileUtility();
		webdriverUtility = new WebdriverUtility();
		jsUtility = new JavaScriptUtility();

		// initialize the data from property file
		fileUtility.initializePropertyFile(IpathConstants.YANTRAPROPERTYFILEPATH);

		// Fetch data from Property file
		//browser = fileUtility.getDataFromPropertyFile("browser");
		url = fileUtility.getDataFromPropertyFile("urlActiTime");
		username = fileUtility.getDataFromPropertyFile("username");
		password = fileUtility.getDataFromPropertyFile("password");
		String timeouts = fileUtility.getDataFromPropertyFile("timeout");
		longTimeout = javaUtility.convertStringToLong(timeouts);

		// Launching the browser in run time based on browser key
		driver = webdriverUtility.setupDriver(browser);
		listenerdriver=driver;
	
		// pre-setting for the Browser

		webdriverUtility.maximizebrowser();
		webdriverUtility.implicitwait(longTimeout);
		// Initialize the explicit wait ,Actions
		webdriverUtility.initializeActions();
		login=new LoginPagevtiger(driver); 
		//loginPage = new LoginPage(driver);
		//commonpage = new CommonPage(driver);
		// Navigate the Application
		webdriverUtility.openApplication(url);
	}

	/**
	 * This method is use to Login the Application
	 */
	@BeforeMethod(alwaysRun=true)
	public void login() {

		// Create object for common POM Repository classes
		ActiTimeLoginPage actiTime=new ActiTimeLoginPage(driver);
		actiTime.loginTheApplication();
		//actiTime.clickOnForgotPasswordButton();

	}

	/**
	 * This Method is used to Logout the Application
	 */
	@AfterMethod(alwaysRun=true)
	public void methodTearDown() {
		//commonpage.clickonLogout();
	}

	/**
	 * This class is used to close the browser
	 */
	@AfterClass(alwaysRun=true)
	public void classTearDown() {
		//excelUtility.workbookClose();
		webdriverUtility.closeBrowser();
	}
}
