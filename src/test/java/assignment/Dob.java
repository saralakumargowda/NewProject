package assignment;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		String todaysxpath="//a[contains(@class,'ui-state-highlight')]";
		String days="/../following-sibling::td";
		String weeks="/../../following-sibling::tr";
		List<WebElement> alldays=driver.findElements(By.xpath(todaysxpath+days));
		List<WebElement> allweeks=driver.findElements(By.xpath(todaysxpath+weeks));
		if(alldays.size()>0)
		{
			driver.findElement(By.xpath("//a[contains(@class,'ui-state-highlight')]/../following-sibling::td[1]/a")).click(); 
		}
		else if(alldays.size()==0)
		{
			driver.findElement(By.xpath("//a[contains(@class,'ui-state-highlight')]/../../following-sibling::tr[1]/td[1]/a)")).click(); 
		}
		else if(allweeks.size()==0)
		{
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			driver.findElement(By.linkText("1")).click();
		}
	}

}
