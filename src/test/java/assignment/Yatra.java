package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yatra {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\Chrome\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.yatra.com/");
	driver.findElement(By.className("more-arr")).click();
	driver.findElement(By.xpath("//span[text()='Cruise']")).click();
	driver.findElement(By.cssSelector("[class='demo-icon icon-go arrow-go']")).click();
	String st=driver.findElement(By.xpath("//div[@class='hotel-desc']/span/h1")).getText();
	System.out.println("Title is:"+st);
	String title=driver.getTitle();
	System.out.println("Title is:"+title);
	driver.close(); 
}
}
