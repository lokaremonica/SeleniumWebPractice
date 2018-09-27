package Listbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class javascript 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.yatra.com/");	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("document.getElementById('BE_flight_origin_city').value ='Bangal'");
	Thread.sleep(2000);
	jse.executeScript("document.getElementById('BE_flight_arrival_city').value = 'NewDelhi'");
	Thread.sleep(2000);
	jse.executeScript("document.getElementById('BE_flight_origin_date').value = 'WELCOME'");
	Thread.sleep(2000);
	driver.findElement(By.id("BE_flight_flsearch_btn")).click();

}
}
