package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.shopping_portal.objectRepository.ActiHomePage;
import org.testng.annotations.Test;
import org.yantra.genericUtility.BaseClass;
import org.yantra.genericUtility.WebdriverUtility;

public class Actitime extends BaseClass{
     @Test(groups= {"Sanity","Regression"})
     
	public static void acti() {
    	 ActiHomePage actiHomePage=new ActiHomePage(driver);
 		ActitimeHome actitimehome=new ActitimeHome(driver);
 		ActitimeHome_alertpopup actitimehome_alertpopup=new ActitimeHome_alertpopup (driver);
 		ActitimeHome_handleCancel actitimehome_handlecancel=new ActitimeHome_handleCancel(driver);
 		WebdriverUtility wbUtility=new WebdriverUtility();
 		actiHomePage.clickOnTypesOfWork();
 		actitimehome.clickoncreateTypeOfWork();
 		actitimehome_alertpopup.clickOnalertPopUp();
 		actitimehome_handlecancel.clickOnhandleCancel();
 		wbUtility.initializeAlertPopup();
     	wbUtility.acceptAlertpopup();
     	wbUtility.senKeysAlertpopup("Alert Pop Up");
 	
	}

}
