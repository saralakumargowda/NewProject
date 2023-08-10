package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeHome_handleCancel {
	
		WebDriver driver;
		
		@FindBy(xpath="//input[@onclick='handleCancel();']") private WebElement handleCancel;
		
		public ActitimeHome_handleCancel(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
			this.driver=driver;
		}
		
		public void clickOnhandleCancel() {
			handleCancel.click();
		}
	}
		

