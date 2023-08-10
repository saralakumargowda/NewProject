package org.shopping_portal.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeLoginPage {
	WebDriver driver;
	@FindBy(xpath = "//input[@id='username']")
	private WebElement txtUsername;
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement txtPassword;
	@FindBy(xpath="//a[@id='loginButton']")
	private WebElement btnLogin;
	@FindBy(xpath="//a[.='Forgot your password?']")
	private WebElement lnkForgotPassword;
	
	public ActiTimeLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	//Business logic
	public void loginTheApplication() {
		txtUsername.sendKeys("admin");
		txtPassword.sendKeys("manager");
		btnLogin.click();
	}
	public void clickOnForgotPasswordButton() {
		lnkForgotPassword.click();
	}
}
