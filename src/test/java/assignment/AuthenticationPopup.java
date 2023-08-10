package assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.yantra.genericUtility.BaseClass;

public class AuthenticationPopup extends BaseClass{
	@Test(groups= {"Regression"})
	public static void Athentication() {
//		ChromeOptions option = new ChromeOptions();
//		option.addArguments("--remote-allow-origins=*");
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver(option);
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		//Synatx:Protocol//Username:Password@Url
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		String text = driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credentials.')]")).getText();
		System.out.println(text);
        driver.quit();
	}
}
