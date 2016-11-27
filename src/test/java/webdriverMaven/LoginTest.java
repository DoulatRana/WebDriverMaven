package webdriverMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp(){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sharathcg\\cucumberMars\\CucumberSelenium\\Jars\\geckodriver.exe");
		driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test
	public void doLogin() throws InterruptedException{
		driver.get("http://www.gmail.com");
		driver.findElement(By.id("Email")).sendKeys("asdffddf@gmail.com");
		driver.findElement(By.xpath(".//*[@id='next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("Passwd")).sendKeys("kjdshag");
	}
	@AfterSuite
	public void tearDown(){
		driver.quit();
	}

}
