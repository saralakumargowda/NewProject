package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderPage {

	@Test
	public void calender() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor jse;
		String requireddate = "November 2025";
		String month = "11";
		String year = "2024";

		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)");

		// Calender type-1
		// Click on first date label box
		driver.findElement(By.xpath("//input[@id='first_date_picker']")).click();
		String presentyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		System.out.println(presentyear);
		while (!presentyear.equals(requireddate)) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			presentyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			System.out.println(presentyear);
		}
		driver.findElement(By.linkText("4")).click();

		// Calendar type-2
		driver.findElement(By.xpath("//input[@id='second_date_picker']")).click();
		String CurrentYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		System.out.println(CurrentYear);
		System.out.println(CurrentYear);
		System.out.println(CurrentYear);
		System.out.println(CurrentYear);
		while (!CurrentYear.equals(requireddate)) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			CurrentYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			System.out.println(CurrentYear);

		}
		driver.findElement(By.linkText("3")).click();

		// Calender type-3
		driver.findElement(By.xpath("//input[@id='third_date_picker']")).click();
		driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")).click();
		driver.findElement(By.xpath("//option[text()='Nov']")).click();
		driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")).click();
		driver.findElement(By.xpath("//option[text()='2025']")).click();
		driver.findElement(By.linkText("12")).click();

		// Calendar type-4

		driver.findElement(By.xpath("//input[@id='fourth_date_picker']")).click();
		driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")).click();
		driver.findElement(By.xpath("//option[text()='Dec']")).click();
		driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")).click();
		driver.findElement(By.xpath("//option[text()='2025']")).click();
		driver.findElement(By.linkText("8")).click();

		// Calendar type-5

		driver.findElement(By.xpath("//input[@id='fifth_date_picker']")).click();
		driver.findElement(By.linkText("10")).click();

		// Calendar type-6
		driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();
		driver.findElement(By.linkText("10")).click();

	}
}
