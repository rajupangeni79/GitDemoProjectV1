package selenium_Hw1;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest2 {
	
	WebDriver driver;
	
	
@Before
	public void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/billing/?ng=login/");		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
}
		
		
@Test	
		public void loginAccount() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demo@techfios.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("abc123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		// Homepage and New Account
		
		driver.findElement(By.xpath("//span[contains(text(), 'Bank & Cash')]")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'New Account')]")).click();
		
		
		// New Account Details
		driver.findElement(By.xpath("//input[@name='account']")).sendKeys("Entertainment Account");
		driver.findElement(By.xpath("//input[@name='description']")).sendKeys("Monthly Deposit");
		driver.findElement(By.xpath("//input[@name='balance']")).sendKeys("US$1534.00");
		driver.findElement(By.xpath("//input[@name='account_number']")).sendKeys("098765461");
		driver.findElement(By.xpath("//input[@name='contact_person']")).sendKeys("Mr.John Kaji");
		driver.findElement(By.xpath("//input[@name='contact_phone']")).sendKeys("8761042377");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
}		


@After
		
		public void tearDown(){
		driver.close();
		driver.quit();
	
}		
	
}
		
	
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	


