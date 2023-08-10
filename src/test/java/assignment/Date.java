package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("[class='hasDatepicker']")).click();
		String year=driver.findElement(By.className("ui-datepicker-year")).getText();
		String month=driver.findElement(By.className("ui-datepicker-month")).getText();
		while(!(month.equals("May")&&year.equals("1993")))
		{
			driver.findElement(By.xpath("//span[text()='Prev']")).click();
			year=driver.findElement(By.className("ui-datepicker-year")).getText();
			 month=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		driver.findElement(By.xpath("//a[text()='24']")).click();
		
	}

	}

