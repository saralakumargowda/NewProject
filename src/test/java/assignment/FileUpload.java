package assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {
	@Test
	public void fileUploading() throws AWTException, InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//a[.='Register']")).click();
        JavascriptExecutor js=(JavascriptExecutor)driver;
        WebElement element = driver.findElement(By.xpath("//button[text()='Upload Resume']"));
        js.executeScript("arguments[0].scrollIntoView()",element);
        element.click();
        //Select a path
        StringSelection path=new StringSelection("C:\\Users\\Admin\\Downloads\\Selenium Syllabus.pdf");
        //Copy the path
        Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
        cb.setContents(path,null);
        //Paste path
        Robot r =new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
//        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
//        WebElement uploaded = driver.findElement(By.xpath("//span[.='Selenium Syllabus.pdf']"));
//        wait.until(ExpectedConditions.visibilityOf(uploaded));
//        if(uploaded.isDisplayed()) {
//        	System.out.println("File is uploaded");
//        }
//        else {
//        	System.out.println("File not uploaded");
//        }
//        driver.quit();
	}
}
