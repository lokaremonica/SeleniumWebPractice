package Simple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class opennclose 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.gecko.driver","D:\\Selenium_Software\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://Google.com");
	driver.close();
}
}
