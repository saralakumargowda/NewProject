package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("[alt='LinkedIn OrangeHRM group']")).click();
		driver.findElement(By.cssSelector("[alt='OrangeHRM on Facebook']")).click();
		driver.findElement(By.cssSelector("[alt='OrangeHRM on twitter']")).click();
		String parentid = driver.getWindowHandle();
		Set<String> allchildid = driver.getWindowHandles();
		for (String childid : allchildid) {
				driver.switchTo().window(childid);
				String title=driver.getTitle();
				if(!title.contains("LinkedIn"))
				{
					driver.close();
				}	
		}
		System.out.println(driver.getTitle());
		driver.close();
		}
	}

      