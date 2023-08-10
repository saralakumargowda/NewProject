package assignment;

import org.shopping_portal.objectRepository.ActiHomePage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.yantra.genericUtility.BaseClass;
import org.yantra.genericUtility.WebdriverUtility;

@Listeners(org.yantra.genericUtility.ListenrsJava.class)
public class ActiPopup extends BaseClass{
	
	@Test(groups={"Regression"})
	
	public static void popup() {		
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
