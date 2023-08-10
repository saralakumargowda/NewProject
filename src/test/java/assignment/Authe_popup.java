package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Authe_popup {
	WebDriver driver;
	@FindBy(xpath="//p[contains(text(),' Congratulations! You must have the prope')]") private WebElement authentication;
	
	public Authe_popup(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	//Business Logic
	
	public void clickonauthentication() 
	{
		
		authentication.click();
	}
}

