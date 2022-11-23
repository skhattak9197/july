package screenshots;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShots {
    
	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception  {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://openweathermap.org/");
	
		WebElement logo = driver.findElement(By.cssSelector("div.section.where-to"));
        File source = logo.getScreenshotAs(OutputType.FILE);
        
        File destination = new File (System.getProperty("user.dir")+ "\\ScreenShots\\screenshots1.png");
        
        FileHandler.copy(source, destination);
	 	
	   driver.switchTo().newWindow(WindowType.TAB);
	   driver.navigate().to("https://www.shadi.com/");
	   
	   WebElement logo1 = driver.findElement(By.cssSelector("div.row.banner-aera"));
	   File source1 = logo1.getScreenshotAs(OutputType.FILE);
	   
	   File destination1 = new File (System.getProperty("user.dir") + "\\ScreenShots\\screenshots2.png");
	   
	   FileHandler.copy(source1, destination1);
	   
	}

}
