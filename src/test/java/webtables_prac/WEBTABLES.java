package webtables_prac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WEBTABLES {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		
		String CompanyName = "Biofil Chemeicals";
		
		List<WebElement> AllCompanyName = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr[4]/td[1]/a"));
		List<WebElement> AllCurrentPrices = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr[4]/td[4]"));
		
	}

}
