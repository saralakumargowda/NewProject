package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot_java {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.amazon.com/");

		Thread.sleep(3000);

		WebElement element = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		File src1 = (File) element.getScreenshotAs(OutputType.FILE);
		File trg2 = new File("./amazon/photo105.jpg");
		FileUtils.copyFile(src1, trg2);

		TakesScreenshot tscr1 = (TakesScreenshot) driver;
		File src2 = tscr1.getScreenshotAs(OutputType.FILE);
		File trg5 = new File("./google/photo88.jpg");
		FileUtils.copyFile(src2, trg5);

	}
}
