package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("[class='btn-orange trial-btn pulse ']")).click();
		//Enter the details
		driver.findElement(By.xpath("//input[@id='Form_submitForm_FirstName']")).sendKeys("Harinisree",Keys.TAB,Keys.TAB,"Uvaraj",Keys.TAB,"pmani498@gmail.com",Keys.TAB,"9632776232");
		WebElement dropdown=driver.findElement(By.xpath("//select[@class='dropdown countries fleft required']"));
		Select s=new Select(dropdown);
		s.selectByVisibleText("India");
		driver.findElement(By.cssSelector("[value='Book Your Free Demo']")).click();
		//Fetching error message
		String st=driver.findElement(By.cssSelector("[id='tips-messages']")).getText();
		System.out.println("Error Message is:"+st);
		driver.close();
}
}
