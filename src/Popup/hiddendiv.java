package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hiddendiv 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.gecko.driver","D:\\Selenium_Software\\geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://www.yatra.com/");
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    jse.executeScript("document.getElementById('BE_flight_origin_date').value='Bangalore'");
	driver.findElement(By.id("BE_flight_origin_date")).click();
	driver.findElement(By.id("30/09/2018")).click();
}
}
