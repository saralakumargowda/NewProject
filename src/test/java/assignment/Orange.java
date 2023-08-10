package assignment;
import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Orange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Contact Sales']")).click();
		//Fill the Details
		driver.findElement(By.xpath("//input[@aria-required='true']")).sendKeys("Karan",Keys.TAB,Keys.TAB,"Wipro",Keys.TAB,"Software Engineer");
		WebElement dropdown=driver.findElement(By.cssSelector("[id='Form_submitForm_NoOfEmployees']"));
		Select s=new Select(dropdown);
		s.selectByVisibleText("201 - 250");
		driver.findElement(By.cssSelector("[placeholder='Email']")).sendKeys("pmani498@gmail.com");
		driver.findElement(By.cssSelector("[placeholder='Your Message']")).sendKeys("Testing Department");
		//JavascriptExecutor jse=(JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,200);");
		driver.findElement(By.name("action_request")).click();
		//Fetching error message
		String er=driver.findElement(By.id("tips-messages")).getText();
		System.out.println("Error Message is:"+er);
		driver.close();
	}

}
