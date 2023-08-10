package org.practice.TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartTest {

	@Test 

	public void flip() throws IOException, InterruptedException {
		{
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver(option);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			FileInputStream fis = new FileInputStream("./src/test/resources/CommonData.properties");
			Properties properties = new Properties();
			properties.load(fis);
			String value = properties.getProperty("searchvalue");
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys(value);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(3000);
			List<WebElement> priceList = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
			ArrayList<Integer>arrayList=new ArrayList<>();
			Iterator<WebElement> list = priceList.iterator();
			while (list.hasNext()) {
				String str = (list.next().getText());
				String price = str.substring(1);
				String listOfPrice = price.replaceAll(",","");
				int cost = Integer.parseInt(listOfPrice);
				arrayList.add(cost);
			}
			Collections.sort(arrayList);
			Collections.reverse(arrayList);
	        System.out.println(arrayList);
	        driver.quit();
		}
	}
}

				
				
//				str.replaceAll("₹","");
//				String[] s = str.split("₹");
//				String[] finalprice = s[1].split(",");
//				String cost = finalprice[0]+finalprice[1];
//				int i=Integer.parseInt(cost);  
//				//Collections.sort(cost);
//				Map<String,Integer>map=new LinkedHashMap<String,Integer>();
//
//				for (int j = 0; j < cost.length(); j++) {
//					map.put(cost,i);
//				}
//				System.out.println(map);
//			}
			