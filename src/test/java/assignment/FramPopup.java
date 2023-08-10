package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramPopup {
	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
//driver.switchTo().frame(0);
//driver.switchTo().frame("iframe_a");

//Frame PopUp Handling
		WebElement frame = driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
		driver.switchTo().frame(frame);
//Page down
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,2000);");
		driver.findElement(By.xpath("//a[text()='View All Jobs']")).click();

//Window PopUP Handling
		Set<String> i = driver.getWindowHandles();
		for (String childid : i)
			driver.switchTo().window(childid);
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-left hide-in-mobile']/li[4]/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'RRB NTPC Stage')][1]")).click();
//Printing the Title
		System.out.println("Title is :" + driver.getTitle());
		driver.quit();
	}

}
