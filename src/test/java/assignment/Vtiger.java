package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://localhost:8888");
			driver.findElement(By.cssSelector("[name='user_name']")).sendKeys("admin",Keys.TAB,"root",Keys.TAB,Keys.ENTER);
			driver.findElement(By.xpath("//td[@class='tabSelected']/a")).click();
			driver.findElement(By.cssSelector("[name='lastname']")).sendKeys("Mani",Keys.TAB,"Infosys");
			driver.findElement(By.xpath("//input[@class='crmButton small save']")).click();
	}

}
