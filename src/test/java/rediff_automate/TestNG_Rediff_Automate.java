package rediff_automate;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Rediff_Automate {

	public static WebDriver driver;
	
	@Test
	public void launchUrl() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.rediff.com/");
	}
	
	@Test
	public void Signin() {
		
		WebElement Signin = driver.findElement(By.className("signin"));
	if (Signin.isDisplayed() && Signin.isEnabled()){
		Signin.click();
	} else {
		System.out.println("The Sigin is fail");
	}
	}
	
	@Test
	public void SigninPage() {
		
		WebElement Username = driver.findElement(By.id("login1"));
		WebElement Password = driver.findElement(By.name("psswd"));
		WebElement SigninLinkbutton = driver.findElement(By.className("Signinbtn"));
		
		if (Username.isDisplayed() && Username.isEnabled() && Password.isDisplayed()&& Password.isEnabled() && SigninLinkbutton.isDisplayed() && SigninLinkbutton.isEnabled()) {
			Username.sendKeys("skmd9197@rediffmail.com");
			Password.sendKeys("Ibrahim@97");
			SigninLinkbutton.click();
		} else {
			System.out.println("The test case is fail");
		}
		}
	
	@Test
	public void Logout() {
		WebElement Logout = driver.findElement(By.className("rd_logout"));
		if (Logout.isDisplayed() && Logout.isEnabled()) {
			Logout.click();
		} else {
			System.out.println("the test case is fail");
		}
	}
	
}


