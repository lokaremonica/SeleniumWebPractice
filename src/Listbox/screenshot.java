package Listbox;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class screenshot 
{
public static void main(String[] args) throws IOException 
{
	System.setProperty("webdriver.gecko.driver","D:\\Selenium_Software\\geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://Google.com");
	EventFiringWebDriver ss = new EventFiringWebDriver(driver);
	File src = ss.getScreenshotAs(OutputType.FILE);
	File dst = new File("C:\\Docfselenium\\test.jpeg");
	FileUtils.copyFile(src, dst);
	driver.quit();
}

}
