package Listbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class slectall 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.gecko.driver","D:\\Selenium_Software\\geckodriver.exe");
	FirefoxDriver fd = new FirefoxDriver();
	fd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	fd.get("file:///C:/Users/Monica/Desktop/sam.html");
	WebElement listbo = fd.findElement(By.id("CountrySelect"));
	 Select llis = new Select(listbo);
	 for(int i=0; i<llis.getOptions().size();i++)
	 {
		 llis.selectByIndex(i);
	 }
}
}
