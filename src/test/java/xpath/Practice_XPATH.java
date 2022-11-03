package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice_XPATH {
	 
	public static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.rediff.com/");
	   	driver.findElement(By.className("signin")).click();
	    driver.findElement(By.id("login1")).sendKeys("skmd9197@rediffmail.com");
	   	driver.findElement(By.id("password")).sendKeys("Ibrahim@97");
	   	
	    

		}

}
