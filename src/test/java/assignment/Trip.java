package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Trip {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.tripadvisor.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.cssSelector("[placeholder='Where to?']")).sendKeys("Club Mahindra",Keys.DOWN,Keys.DOWN,Keys.ENTER);
	driver.findElement(By.xpath("//span[@class='eKtLG']/span[1]")).click();
	driver.findElement(By.xpath("//span[@class='WlYyy dTqpp'][1]")).click();
	WebElement rating=driver.findElement(By.xpath("//span[contains(@class,'ui_bubble_rating')]"));
	Actions act=new Actions(driver);
	act.dragAndDropBy(rating,40, 0).sendKeys(Keys.TAB,"Its very Good for Relaxiation",Keys.TAB,"Nice place to spend time").perform();
	WebElement dropdown=driver.findElement(By.name("trip_date_month_year"));
	Select s=new Select(dropdown);
	s.selectByVisibleText("April 2022");
	driver.findElement(By.cssSelector("[type='checkbox']")).click();
	driver.close();
	

	
	}

}
