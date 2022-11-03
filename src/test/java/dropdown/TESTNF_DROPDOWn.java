package dropdown;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TESTNF_DROPDOWn {

	
	public static WebDriver driver;
	public static Select select;
	
	@Test
	public void launchUrl() throws Exception {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
    
    
    driver.findElement(By.name("firstname")).sendKeys("Tim");
    driver.findElement(By.name("lastname")).sendKeys("John");
    driver.findElement(By.name("reg_email__")).sendKeys("mwildaan255@gmail.com");
    driver.findElement(By.name("reg_passwd__")).sendKeys("Ibrahim@997");
    
    
	Select select = new Select(driver.findElement(By.id("month")));
	select.selectByVisibleText("Mar");
	
	Select  select1 = new Select(driver.findElement(By.id("day")));
	select1.selectByVisibleText("16");
	
	Select select2 = new Select(driver.findElement(By.id("year")));
	select2.selectByVisibleText("1989");
	
	driver.findElement(By.className("_58mt")).click();
	driver.findElement(By.name("websubmit")).click();
	
	
		
	
	
	
	}
	
}
