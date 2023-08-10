package org.shopping_portal.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginButton {
	WebDriver driver;
	@FindBy(xpath="//button[@id='pwd']")
	private WebElement loginButton;
	
	public LoginButton(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public void getLoginButton() {
		loginButton.click();
	}
}
