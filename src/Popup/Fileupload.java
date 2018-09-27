package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fileupload 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.gecko.driver","D:\\Selenium_Software\\geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://www.sendspace.com/");
	driver.findElement(By.id("upload_file")).sendKeys("C:\\Docfselenium\\hey.txt");	
}
}
