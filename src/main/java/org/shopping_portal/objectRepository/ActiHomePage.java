package org.shopping_portal.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiHomePage {
	WebDriver driver;
	@FindBy(xpath="//a[text()='Types of Work']") private WebElement typesOfWork;
	

	public ActiHomePage(WebDriver driver) {
		
			PageFactory.initElements(driver,this);
			this.driver=driver;
		}
	//Business logic
	  public void clickOnTypesOfWork() {
		  typesOfWork.click();
	  }
	
	}




//driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
//driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
//driver.findElement(By.cssSelector("[id='name']")).sendKeys("Alert Pop Up");
//driver.findElement(By.xpath("//input[@onclick='handleCancel();']")).click();