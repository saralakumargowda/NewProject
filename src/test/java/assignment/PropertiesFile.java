package assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertiesFile {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/CommonData.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String username = pobj.getProperty("username").trim();
		String password = pobj.getProperty("password");
		String url = pobj.getProperty("urlActiTime");
		
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
	    WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
        driver.quit();
	}
}
