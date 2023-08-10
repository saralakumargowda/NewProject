package assignment;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brkenlinks {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (WebElement link : links) {
			String linkURL = link.getAttribute("href");
			URL url = new URL(linkURL);
			URLConnection urlConection = url.openConnection();
			HttpURLConnection httpurl = (HttpURLConnection) urlConection;
			httpurl.setConnectTimeout(5000);
			httpurl.connect();
			if (httpurl.getResponseCode() == 200) {
				System.out.println(linkURL + " - " + " is broken link" + httpurl.getResponseMessage());
			} else {
				System.out.println(linkURL + " - " + " is valid link" + httpurl.getResponseCode());
			}
		}
	}
}
