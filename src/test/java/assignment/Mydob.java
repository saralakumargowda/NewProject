package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mydob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		Boolean condition = true;
		while (condition) {
			String year = driver.findElement(By.className("ui-datepicker-year")).getText();
			String month = driver.findElement(By.className("ui-datepicker-month")).getText();
			if (!year.equals("1993")) {
				driver.findElement(By.xpath("//span[text()='Prev']")).click();
			}
			if (!month.equals("May")) {
				driver.findElement(By.xpath("//span[text()='Prev']")).click();
			}
			if (year.equals("1993")) {
				if (month.equals("May")) {
					condition = false;
				}

			}

		}
		driver.findElement(By.linkText("24")).click();
	}
}
