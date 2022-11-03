package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DROP_DOWN_MENU {

	public static WebDriver driver;
	public static Select select;

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[@id = 'reg_pages_msg']/preceding::a[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.name("firstname")).sendKeys("John");
		driver.findElement(By.name("lastname")).sendKeys("tim");
		driver.findElement(By.name("reg_email__")).sendKeys("mwildaan255@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Wildaan9197");

		select = new Select(driver.findElement(By.name("birthday_month")));
		select.selectByVisibleText("July");

		Thread.sleep(2000);
		select = new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("16");

		select = new Select(driver.findElement(By.id("year")));
		select.selectByVisibleText("1987");

		driver.findElement(By.className("_58mt")).click();
		driver.findElement(By.cssSelector("button#u_2_s_CH")).click();

	}

}
