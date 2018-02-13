package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSelenuimTest {
	
	static String browser;
	static WebDriver driver;
	
	public static void main(String[] args) {
		setBrowser();
		setBrowserConfig();
		runTest();
		tearDown();
	}
	
	public static void setBrowser() {
		browser = "Chrome";
	}
	
	public static void setBrowserConfig() {
		if (browser.contains("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SerOliver\\Desktop\\Selenium\\chromedriver.exe");
			System.setProperty("webdriver.chrome.bin", "C:\\Program Files (x86)\\Google\\Chrome\\Application");
			driver = new ChromeDriver();
			
			
		} else {
			System.out.println(browser + "invalid");
		}
	}
	
	public static void runTest() {
		driver.get("http://google.com");
	}
	
	public static void tearDown() {
		driver.quit();
	}

}
