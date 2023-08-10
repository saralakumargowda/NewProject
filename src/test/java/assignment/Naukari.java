package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Naukari {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/");
		//Hidden Pop Up
		WebElement wb = driver.findElement(By.xpath("//div[text()='Jobs']"));
		Actions act = new Actions(driver);
		act.moveToElement(wb).perform();
		driver.findElement(By.xpath("//a[@title='IT jobs']")).click();
		//Window Pop Up
		String Parentid = driver.getWindowHandle();
		Set<String> i = driver.getWindowHandles();
		for (String childid : i)
			driver.switchTo().window(childid);
		driver.findElement(By.xpath("//a[text()='Mainframe Developer']")).click();
		//Window Pop Up
		Set<String> j = driver.getWindowHandles();
		for (String childid2 : j)
			driver.switchTo().window(childid2);
		System.out.println("The Title is :" + driver.getTitle());
	}
}
