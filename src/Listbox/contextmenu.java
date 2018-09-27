package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class contextmenu 
{
public static void main(String[] args) //throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver","D:\\Selenium_Software\\geckodriver.exe");
	//System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Software\\chromedriver.exe");
	 WebDriver driver = new FirefoxDriver();
	//WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	WebElement link = driver.findElement(By.xpath("//a[contains(text(),'actiTIME Inc.')]"));
	Actions ac = new Actions(driver);
	ac.contextClick(link).perform();
	ac.sendKeys(link, "T").perform();
	driver.quit();
}
}
