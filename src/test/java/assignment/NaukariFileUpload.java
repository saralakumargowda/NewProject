package assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NaukariFileUpload {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//div[text()='Register']")).click();
		String parentid = driver.getWindowHandle();
		Set<String> i = driver.getWindowHandles();
		for (String childid : i) {
			if (!parentid.equals(childid)) {
				driver.switchTo().window(childid);
			}
		}
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,2500);");
		driver.findElement(By.xpath("//h2[contains(text(),'Experienced')]")).click();
		driver.findElement(By.xpath("//button[contains(@class,'uploadResume')]")).click();
		StringSelection path = new StringSelection("C:\\Users\\Admin\\Desktop\\CV\\Mani.P-CV.pdf");
		Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
		clip.setContents(path, null);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Mani.P-CV')]")));
		driver.quit();
	}
}
