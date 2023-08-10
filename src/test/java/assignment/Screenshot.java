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

public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.tirumala.org/#");
		//Take a screenshot
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("./Nani/sche.png");
		FileUtils.copyFile(src, trg);
		//Take a screenshot for particular element
		WebElement session = driver.findElement(By.className("image_main"));
		File src1 = session.getScreenshotAs(OutputType.FILE);
		File trg1 = new File("./Nani/sf.png");
		FileUtils.copyFile(src1, trg1);
		driver.close();
	}
                                                                                                                                                                          
}
