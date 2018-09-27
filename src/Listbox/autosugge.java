package Listbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class autosugge 
{
public static void main(String[] args) throws InterruptedException 
{
	//System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Software\\chromedriver.exe");
	System.setProperty("webdriver.gecko.driver","D:\\Selenium_Software\\geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();
	//WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://Google.com");
   driver.findElement(By.id("lst-ib")).sendKeys("selenium");
    Thread.sleep(5000);
	String xp = "//div[contains(text(),'selenium')]";
	List<WebElement> allaa = driver.findElements(By.xpath(xp));
	int count = allaa.size();
	System.out.println(count);
	for(int i=0; i<count; i++)
	{
		String trc = allaa.get(i).getText();
		System.out.println(trc);
	}	
		driver.close();

}
}
