package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeHome_alertpopup {
	WebDriver driver;
	
	@FindBy(xpath="[id='name']") private WebElement alertPopUp;
	
	public ActitimeHome_alertpopup(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public void clickOnalertPopUp() {
		alertPopUp.click();
	}
}
	

