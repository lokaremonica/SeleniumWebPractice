package frameworkint;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class supertestng 
{
	public WebDriver driver;
	
	@BeforeMethod
public void preconditions()
{
	System.setProperty("webdriver.gecko.driver","D:\\Selenium_Software\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/login.do");
	
}
	@AfterMethod
	public void postcondition()
	{
		driver.quit();
	}
}
