package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ActitimeHome {
	WebDriver driver;
	@FindBy(xpath="/span[text()='Create Type of Work']") private WebElement createTypeOfWork;
	
	public ActitimeHome(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	//Business Logic
	
	public void clickoncreateTypeOfWork() {
		
		createTypeOfWork.click();
		
	}
	}
	


