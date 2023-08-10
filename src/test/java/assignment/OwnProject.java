package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OwnProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("E:/selenium/Demo.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dropdown = driver.findElement(By.id("Movies"));
		Select s = new Select(dropdown);
		s.selectByVisibleText("Pushpa");
		s.selectByVisibleText("RRR");
		s.selectByVisibleText("KGF2");
		List<WebElement> alloptions = s.getAllSelectedOptions();
		for (WebElement i : alloptions) {
			System.out.println(i.getText());
		}
		System.out.println(s.isMultiple());
		//s.deselectByVisibleText("RRR");
		//s.deselectByVisibleText("KGF2");
		s.deselectAll();
		System.out.println(s.isMultiple());
		s.getAllSelectedOptions();
		driver.close();
	}

}