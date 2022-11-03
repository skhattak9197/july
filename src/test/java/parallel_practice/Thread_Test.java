package parallel_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Thread_Test {

	
	public static WebDriver driver;
	
	@Test(threadPoolSize = 3, invocationCount = 3)
	public void testcase1() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		
	}
	
	@Test(threadPoolSize = 3, invocationCount = 3)
	public void testcase2() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.Amazon.com/");
}
}