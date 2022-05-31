package selenium_Hw1;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddAccount {
	
	WebDriver driver;
	
	
	
	@Before
	public void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://techfios.com/billing/?ng=login/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}		
	
	@Test
		//Login to the Browser
	
		public void loginTest() { 
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demo@techfios.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("abc123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	
		//Adding New Account Information
	
		driver.findElement(By.xpath("//span[contains(text(), 'Bank & Cash')]")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'New Account')]")).click();
		driver.findElement(By.xpath("//input[@id='account']")).sendKeys("Saving Account202224524");
		driver.findElement(By.xpath("//input[@id='description']")).sendKeys("Direct Deposit");
		driver.findElement(By.xpath("//input[@id='balance']")).sendKeys("US$.9999.99");
		driver.findElement(By.xpath("//input[@id='account_number']")).sendKeys("00987654321555567576");
		driver.findElement(By.xpath("//input[@id='contact_person']")).sendKeys("Mr.Pangeni");
		driver.findElement(By.xpath("//input[@id='contact_phone']")).sendKeys("9723495343");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

		
	}		
	
	@After
		public void tearDown() {
		driver.close();
		driver.quit();
		
	}
		
	

}
