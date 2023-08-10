 package assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException, AWTException {
	 System.setProperty("webdriver.chrome.driver","E:\\selenium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement travel=driver.findElement(By.xpath("//div[text()='Travel']"));
		Actions act=new Actions(driver);
		act.contextClick(travel).build().perform(); 
		act.keyDown(Keys.SHIFT).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform(); 
		//act.keyUp(Keys.SHIFT).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		/*Robot r= new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);*/
		//act.click().perform();
		driver.close();
		}
}
