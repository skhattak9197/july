package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Understanding {
	public static WebDriver driver;
	
	
	public static void main(String[] args) {
		
		/*
		 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
		 * driver.manage().window().maximize();
		 * driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 * driver.findElement(By.cssSelector("input.signinbtn")).click();
		 * 
		 * Alert alert = driver.switchTo().alert();
		 * 
		 * 
		 * 
		 * System.out.println("The text of the alert is;" + alert.getText());
		 * 
		 * alert.accept();
		 */
		 
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name = 'submit']")).click();
		
		
	Alert alert = driver.switchTo().alert();
	
	System.out.println("The text of the alert is: " + alert.getText());
	
    alert.accept();
    
	}
	

}
