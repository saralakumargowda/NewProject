package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {
	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
		String projectPath = System.getProperty("user.dir");
		String chromeDriverpath = projectPath + "\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverpath);
//WebDriver driver=new ChromeDriver();
//driver.get("www.google.com");
//		PdfReader pdfReader = new PdfReader();
//		System.out.println(pdfReader.readPdf("C:\\Users\\Admin\\Desktop\\Manual Project\\Requirements Document Example.pdf"));
}

}
